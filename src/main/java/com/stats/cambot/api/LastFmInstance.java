package com.stats.cambot.api;

import com.stats.cambot.config.LastFmProperties;
import de.umass.lastfm.Authenticator;
import de.umass.lastfm.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class LastFmInstance {

    @Autowired
    private final LastFmProperties lastFmProperties;

    public LastFmInstance(LastFmProperties lastFmProperties) {
        this.lastFmProperties = lastFmProperties;
    }

    public Session getSession() {
        return Authenticator.getMobileSession(lastFmProperties.getUsername(),
                lastFmProperties.getPassword(),
                lastFmProperties.getApiKey(),
                lastFmProperties.getApiSecret());
    }

    public void test() {

    }
}
