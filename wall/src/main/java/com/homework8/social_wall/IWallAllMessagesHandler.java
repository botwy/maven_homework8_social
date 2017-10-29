package com.homework8.social_wall;

import com.homework8.social_wall.domain.WallMessageModel;

import java.util.List;

/**
 * Модуль wall Интерфейс для работы со списком сообщений на стене
 * Этот модуль зависит от модуля Пользователи
 */
public interface IWallAllMessagesHandler {
    List<WallMessageModel> getList_messages();
}
