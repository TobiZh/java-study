package com.sh.tobi.async.service;

public interface ThreadService {

    int startCount();

    int changeStartCount();


    String like(int fromUserId,int toUserId);
}
