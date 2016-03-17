package com.thejavaside.rest.api;

import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Created by jgao on 3/1/16.
 */
public class User {
    private long id;
    private String name;

    public User() {
    }

    public User(long id, String content) {
        this.id = id;
        this.name = content;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return this.name;
    }
}
