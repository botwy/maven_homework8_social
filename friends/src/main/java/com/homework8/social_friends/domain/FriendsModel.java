package com.homework8.social_friends.domain;

import com.homework8.social_friends.IFriends;
import com.homework8.social_users.IUser;

import java.util.List;

/**
 *  Модуль friends Абстрактная модель Друзья
 *  Этот модуль зависит от модуля Пользователи
 */
public abstract class FriendsModel implements IFriends{
    private String owner_id;
    private List<IUser> list_users;

    public boolean addFriend(IUser user) {

        return this.list_users.add(user);
    }
}
