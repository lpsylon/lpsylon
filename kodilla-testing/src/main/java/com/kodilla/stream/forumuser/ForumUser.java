package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.Objects;

public final class ForumUser {
    private final int userID;
    private final char sex;
    private final LocalDate birth;
    private final int postsQuantity;

    public ForumUser(int userID, char sex, LocalDate birth, int postsQuantity) {
        this.userID = userID;
        this.sex = sex;
        this.birth = birth;
        this.postsQuantity = postsQuantity;
    }

    public Integer getUserID() {
        return userID;
    }

    public char getSex() {
        return sex;
    }

    public LocalDate getBirth() {
        return birth;
    }

    public int getPostsQuantity() {
        return postsQuantity;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "userID=" + userID +
                ", sex=" + sex +
                ", birth=" + birth +
                ", postsQuantity=" + postsQuantity +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ForumUser forumUser = (ForumUser) o;
        return userID == forumUser.userID;
    }

    @Override
    public int hashCode() {
        return Objects.hash(userID);
    }
}
