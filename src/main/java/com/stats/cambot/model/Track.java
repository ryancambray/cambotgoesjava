package com.stats.cambot.model;

import java.util.StringJoiner;

public class Track {

    private Long id;
    private String name;
    private Artist artist;
    private String timestamp;
    private Album album;

    private Track(Builder builder) {
        this.id = id;
        this.name = name;
        this.artist = artist;
        this.timestamp = timestamp;
        this.album = album;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static Builder newBuilder(Track copy) {
        Builder builder = new Builder();
        builder.id = copy.getId();
        builder.name = copy.getName();
        builder.artist = copy.getArtist();
        builder.timestamp = copy.getTimestamp();
        builder.album = copy.getAlbum();
        return builder;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Artist getArtist() {
        return artist;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public Album getAlbum() {
        return album;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Track.class.getSimpleName() + "[", "]")
                .add("id=" + id)
                .add("name='" + name + "'")
                .add("artist='" + artist + "'")
                .add("album='" + album + "'")
                .add("timestamp='" + timestamp + "'")
                .toString();
    }

    public static final class Builder {
        private Long id;
        private String name;
        private Artist artist;
        private String timestamp;
        private Album album;

        private Builder() {
        }

        public Builder withId(Long id) {
            this.id = id;
            return this;
        }

        public Builder withName(String name) {
            this.name = name;
            return this;
        }

        public Builder withArtist(Artist artist) {
            this.artist = artist;
            return this;
        }

        public Builder withTimestamp(String timestamp) {
            this.timestamp = timestamp;
            return this;
        }

        public Builder withAlbum(Album album) {
            this.album = album;
            return this;
        }

        public Track build() {
            return new Track(this);
        }

    }
}
