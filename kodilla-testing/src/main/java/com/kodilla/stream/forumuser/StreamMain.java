package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {
    public static void main(String[] args) {

        Forum forum = new Forum();

        Map<Integer, ForumUser> users = forum.getUserList().stream()
                .filter(ForumUser -> ForumUser.getSex() == 'm')
                .filter(ForumUser -> ForumUser.getBirth().isBefore(LocalDate.now().minusYears(20)))
                .filter(ForumUser -> ForumUser.getPostsQuantity() >= 1)
                .collect(Collectors.toMap(ForumUser::getUserID, f -> f));
        users.entrySet().stream()
                .map(entry -> entry.getKey() + ": " + entry.getValue())
                .forEach(System.out::println);
    }
}
