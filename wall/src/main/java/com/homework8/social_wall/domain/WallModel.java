package com.homework8.social_wall.domain;

import com.homework8.social_users.IUser;
import com.homework8.social_wall.IWall;
import com.homework8.social_wall.IWallAllMessagesHandler;

import java.util.List;

/**
 * Модуль wall Абстрактная модель по работе со стеной
 * Этот модуль зависит от модуля Пользователи
 */
public abstract class WallModel implements IWall, IWallAllMessagesHandler {
    private String id;
    private List<WallMessageModel> list_messages;
    private IUser user_owner;

    public WallModel() {
    }

    public WallModel(String id, List<WallMessageModel> list_messages, IUser user_owner) {
        this.id = id;
        this.list_messages = list_messages;
        this.user_owner = user_owner;
    }

    public List<WallMessageModel> getList_messages() {
        return this.list_messages;
    }
}
