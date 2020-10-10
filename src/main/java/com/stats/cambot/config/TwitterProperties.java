package com.stats.cambot.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("twitter")
public class TwitterProperties {

        private String apiKey;
        private String apiSecret;
        private String accessToken;
        private String accessTokenSecret;

        public String getApiKey() {
            return apiKey;
        }

        public String getApiSecret() {
            return apiSecret;
        }

        public String getAccessToken() {
            return accessToken;
        }

        public String getAccessTokenSecret() {
            return accessTokenSecret;
        }
}
