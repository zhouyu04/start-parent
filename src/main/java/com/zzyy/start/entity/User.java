package com.zzyy.start.entity;

import lombok.Data;

import java.io.Serializable;

@Data
public class User implements Serializable {

    private static final long serialVersionUID = -339516038496531943L;

    private String id;

    private String username;

    private String nickname;

    public User() {
    }

    public User(String username, String nickname) {
        this.username = username;
        this.nickname = nickname;
    }

}
