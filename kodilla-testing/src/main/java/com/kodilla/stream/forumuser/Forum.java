package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Forum {

    public List<ForumUser> getUserList(){
        final List<ForumUser>list=new ArrayList<>();
        list.add(new ForumUser(2,'m', LocalDate.of(1985,11,04),1));
        list.add(new ForumUser(3,'m', LocalDate.of(2019,11,04),1));
        list.add(new ForumUser(4,'m', LocalDate.of(1987,11,04),0));
        list.add(new ForumUser(5,'m', LocalDate.of(1988,11,04),0));
        list.add(new ForumUser(6,'k', LocalDate.of(2019,11,04),1));
        list.add(new ForumUser(7,'k', LocalDate.of(1999,11,04),1));

        return new ArrayList<>(list);
    }
}
