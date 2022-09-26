package com.sh.tobi.base;

import com.sh.tobi.service.TobiService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class JavaBaseApplicationTests {

    @Autowired
    private TobiService tobiService;
    @Test
    void contextLoads() {

    }

    @Test
    void myStarter(){
        System.out.println(tobiService.sayHello());
    }

}
