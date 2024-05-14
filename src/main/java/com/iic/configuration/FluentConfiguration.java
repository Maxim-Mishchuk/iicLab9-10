package com.iic.configuration;

import org.fluentd.logger.FluentLogger;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FluentConfiguration {
    @Value("${fluent.tagPrefix}")
    private String tagPrefix;
    @Value("${fluent.ip}")
    private String ip;
    @Value("${fluent.port}")
    private Integer port;

    @Bean
    public FluentLogger fluentLogger() {
        return FluentLogger.getLogger(tagPrefix, ip, port);
    }
}
