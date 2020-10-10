package com.stats.cambot.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("spotify")
public class SpotifyProperties {

    private String scope;
    private String username;
    private String clientId;
    private String clientSecret;
    private String redirectUri;

    public String getScope() {
        return scope;
    }

    public String getUsername() {
        return username;
    }

    public String getClientId() {
        return clientId;
    }

    public String getClientSecret() {
        return clientSecret;
    }

    public String getRedirectUri() {
        return redirectUri;
    }
}
