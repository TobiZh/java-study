package com.sh.tobi.generator;

import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.PackageConfig;
import com.baomidou.mybatisplus.generator.config.StrategyConfig;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class JavaGeneratorApplicationTests {

    @Test
    void contextLoads() {


    }


    /**
     * 数据源配置
     */
    private static final DataSourceConfig DATA_SOURCE_CONFIG = new DataSourceConfig
            .Builder("jdbc:mysql://localhost:3306/mybatis-plus-demo?serverTimezone=Asia/Shanghai",
            "root", "root")
            .build();

    @Test
    void generator(){
        AutoGenerator generator = new AutoGenerator(DATA_SOURCE_CONFIG);

        GlobalConfig globalConfig=new GlobalConfig.Builder()
                .author("tobizh")
                .outputDir(System.getProperty("user.dir")+"/java-common/src/main/java")
                .build();
        generator.global(globalConfig);


        PackageConfig packageConfig=new PackageConfig.Builder()
                .parent("com.sh.tobi.common")
                .moduleName("ant")
                .build();
        generator.packageInfo(packageConfig);

        generator.execute();

    }

}
