package com.homework8.social_friends;

import com.homework8.social_users.IUser;

import java.util.List;

/**
 * Модуль friends Интерфейс для работы с друзьями
 * Этот модуль зависит от модуля Пользователи
 */
public interface IFriends {
    List<IUser> getAllFriends();

    boolean addFriend(IUser user);
}
