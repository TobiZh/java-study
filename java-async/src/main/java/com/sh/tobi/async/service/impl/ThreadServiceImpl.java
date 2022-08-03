package com.sh.tobi.async.service.impl;

import com.sh.tobi.async.service.ThreadService;
import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;


@Service
public class ThreadServiceImpl implements ThreadService {
    @Override
    public int startCount() {
        System.out.println("点赞");
        return 10;
    }

    @Override
    public int changeStartCount() {
        System.out.println("更新点赞数量完成");
        return 12;
    }
}
