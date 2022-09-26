package com.sh.tobi.configure;

import com.sh.tobi.service.TobiService;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties({TobiProperties.class})
public class TobiAutoConfiguration {


    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(prefix = TobiProperties.PREFIX, name = "name", matchIfMissing = true)
    public TobiService helloService(TobiProperties tobiProperties) {
        return new TobiService(tobiProperties);
    }
}
