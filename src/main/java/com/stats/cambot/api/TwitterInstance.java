package com.stats.cambot.api;

import com.stats.cambot.config.TwitterProperties;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import twitter4j.DirectMessage;
import twitter4j.Status;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
import twitter4j.conf.ConfigurationBuilder;

@Component
public class TwitterInstance {

    @Autowired
    private final TwitterProperties twitterProperties;

	final static Logger logger = LogManager.getLogger();

    public TwitterInstance(TwitterProperties twitterProperties) {
        this.twitterProperties = twitterProperties;
    }

    public TwitterFactory getTwitterInstance() {
        ConfigurationBuilder configurationBuilder = new ConfigurationBuilder();

        configurationBuilder.setDebugEnabled(true)
                .setOAuthConsumerKey(twitterProperties.getApiKey())
                .setOAuthConsumerSecret(twitterProperties.getApiSecret())
                .setOAuthAccessToken(twitterProperties.getAccessToken())
                .setOAuthAccessTokenSecret(twitterProperties.getAccessTokenSecret());

        logger.info("Twitter instance successfully returned");

        return new TwitterFactory(configurationBuilder.build());
    }

    public String createTweet(String tweet) throws TwitterException {
        Twitter twitter = getTwitterInstance().getInstance();
        Status status = twitter.updateStatus(tweet);
        return status.getText();
    }

}
