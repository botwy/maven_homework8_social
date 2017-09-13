package com.homework8.social_friends;

import com.homework8.social_users.IUser;

import java.util.List;

public interface IFriends {
    List<IUser> getAllFriends();

    boolean addFriend(IUser user);
}
