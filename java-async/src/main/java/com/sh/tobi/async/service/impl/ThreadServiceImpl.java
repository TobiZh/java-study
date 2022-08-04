package com.sh.tobi.async.service.impl;

import cn.hutool.core.lang.Console;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.sh.tobi.async.ant.entity.TUserCount;
import com.sh.tobi.async.ant.entity.TUserFollow;
import com.sh.tobi.async.ant.service.impl.TUserCountServiceImpl;
import com.sh.tobi.async.ant.service.impl.TUserFollowServiceImpl;
import com.sh.tobi.async.service.ThreadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.interceptor.TransactionAspectSupport;

import java.util.Objects;


@Service
public class ThreadServiceImpl implements ThreadService {


    @Autowired
    private TUserFollowServiceImpl tUserFollowService;
    @Autowired
    private TUserCountServiceImpl tUserCountService;


    @Override
    public int startCount() {

        return 10;
    }

    @Override
    public int changeStartCount() {
        System.out.println("更新点赞数量完成");
        return 12;
    }


    @Transactional
    @Override
    public String like(int fromUserId, int toUserId) {

        TUserFollow temp = tUserFollowService.getOne(Wrappers.<TUserFollow>lambdaQuery()
                .eq(TUserFollow::getFromUserId, fromUserId)
                .eq(TUserFollow::getToUserId, toUserId));
        boolean isSave = false;
        if (Objects.isNull(temp)) {
            TUserFollow userFollow = new TUserFollow();
            userFollow.setFromUserId(fromUserId);
            userFollow.setToUserId(toUserId);
            userFollow.setStatus(1);
            userFollow.setIsFollow(0);
            isSave = tUserFollowService.save(userFollow);
        } else if (temp.getStatus() == 0) {
            temp.setStatus(1);
            tUserFollowService.updateById(temp);
        } else {
            return "请不要重复点赞";
        }
        if (!isSave) {
            // 手动回滚
            TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
        }

        new Thread(new Runnable() {
            @Override
            public void run() {
                Console.log("开始子线程");
                TUserCount temp = tUserCountService.getOne(Wrappers.<TUserCount>lambdaQuery()
                        .eq(TUserCount::getUserId, toUserId));
                if (Objects.isNull(temp)) {
                    TUserCount tUserCount = new TUserCount();
                    tUserCount.setUserId(toUserId);
                    tUserCount.setFansCount(1);
                    tUserCount.setFollowCount(0);
                    tUserCountService.save(tUserCount);
                } else {
                    temp.setFansCount(temp.getFansCount() + 1);
                    tUserCountService.updateById(temp);
                }

                Console.log("子线程执行完毕");
            }
        }).start();

        Console.log("主线程执行完成");
        return "操作完成";
    }
}
