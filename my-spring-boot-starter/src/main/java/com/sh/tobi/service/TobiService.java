package com.sh.tobi.service;

import com.sh.tobi.configure.TobiProperties;

public class TobiService {

    private TobiProperties tobiProperties;

    public TobiService(TobiProperties tobiProperties) {
        this.tobiProperties = tobiProperties;
    }

    public String sayHello(){
        return "hello: "+tobiProperties.getName();
    }
}
