package com.green.servertoserver.config.constants;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Getter
@ConfigurationProperties(prefix = "constants.feign-client.kma")
@RequiredArgsConstructor
public class ConstKma {
    private final String serviceKey;
    private final String dataType;
}
