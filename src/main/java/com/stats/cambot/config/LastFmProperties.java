package com.stats.cambot.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("lastfm")
public class LastFmProperties {

    private String apiKey;
    private String apiSecret;
    private String username;
    private String password;

    public String getApiKey() {
        return apiKey;
    }

    public String getApiSecret() {
        return apiSecret;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

}
