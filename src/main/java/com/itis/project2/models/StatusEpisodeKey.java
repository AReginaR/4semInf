package com.itis.project2.models;

import java.io.Serializable;
import java.util.Objects;

public class StatusEpisodeKey implements Serializable {

    private Integer user;

    private Integer episode;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StatusEpisodeKey that = (StatusEpisodeKey) o;
        return Objects.equals(user, that.user) &&
                Objects.equals(episode, that.episode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(user, episode);
    }
}
