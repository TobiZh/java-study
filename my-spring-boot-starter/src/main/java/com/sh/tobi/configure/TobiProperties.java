package com.sh.tobi.configure;


import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = TobiProperties.PREFIX)
public class TobiProperties {

    /**
     * 配置前缀
     */
    public static final String PREFIX = "tobi";

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
