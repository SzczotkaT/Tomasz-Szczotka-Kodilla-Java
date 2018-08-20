package com.kodilla.stream.forumuser;

import java.lang.*;
import java.time.LocalDate;
import java.util.Objects;

public final class ForumUser {
    private final int userId;
    private final String userName;
    private final char sex;
    private final LocalDate birthDay;
    private final int postsQ;

    public ForumUser(int userId, String userName, char sex, int postsQ, int yearOfBirth, int monthOfBirth, int dayOfBirth) {
        this.userId = userId;
        this.userName = userName;
        this.sex = sex;
        this.birthDay = LocalDate.of(yearOfBirth, monthOfBirth, dayOfBirth);
        this.postsQ = postsQ;
    }

    public int getUserId() {
        return userId;
    }

    public String getUserName() {
        return userName;
    }

    public char getSex() {
        return sex;
    }

    public LocalDate getBirthDay() {
        return birthDay;
    }

    public int getPostsQ() {
        return postsQ;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", sex=" + sex +
                ", birthDay=" + birthDay +
                ", postsQ=" + postsQ +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ForumUser forumUser = (ForumUser) o;
        return userId == forumUser.userId &&
                sex == forumUser.sex &&
                postsQ == forumUser.postsQ &&
                Objects.equals(userName, forumUser.userName) &&
                Objects.equals(birthDay, forumUser.birthDay);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userId);
    }
}
