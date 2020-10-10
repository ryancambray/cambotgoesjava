package com.stats.cambot.services;


import com.stats.cambot.api.LastFmInstance;
import com.stats.cambot.api.SpotifyInstance;
import com.stats.cambot.api.TwitterInstance;
import org.springframework.beans.factory.annotation.Autowired;

public class DynamicPlaylister {

    @Autowired
    private TwitterInstance twitterInstance;

    @Autowired
    private LastFmInstance lastFmInstance;

    @Autowired
    private SpotifyInstance spotifyInstance;

    public DynamicPlaylister() {

    }

}
