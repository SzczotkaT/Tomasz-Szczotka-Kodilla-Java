package com.kodilla.stream.forumuser;

import java.util.ArrayList;
import java.util.List;

public final class Forum {
    private final List<ForumUser> forumUserList = new ArrayList<>();

    public Forum(){
        forumUserList.add(new ForumUser(1,"Uno",'M',5, 1998,10,25));
        forumUserList.add(new ForumUser(22,"Miranda",'F',20, 2005,1,13));
        forumUserList.add(new ForumUser(37,"Pier16",'M',0, 1986,12,9));
        forumUserList.add(new ForumUser(46,"Ingaro",'M',25, 2004,5,20));
        forumUserList.add(new ForumUser(59,"Moja",'F',213, 1999,6,15));
        forumUserList.add(new ForumUser(49,"Inferno",'M',54, 1995,3,2));
        forumUserList.add(new ForumUser(31,"Lucyfer666",'M',11, 2008,8,20));
        forumUserList.add(new ForumUser(8,"Nana15",'F',16, 2000,12,12));
        forumUserList.add(new ForumUser(19,"Farra",'F',321, 1997,1,28));
    }

    public List<ForumUser> getForumUserList() {
        return new ArrayList<>(forumUserList);
    }
}
