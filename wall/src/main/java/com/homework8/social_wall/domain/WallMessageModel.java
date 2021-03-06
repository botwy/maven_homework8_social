package com.homework8.social_wall.domain;

import com.homework8.social_users.IUser;
import com.homework8.social_wall.IWallReaderMessage;
import com.homework8.social_wall.IWallSenderMessage;

/**
 * Модуль wall Абстрактная модель по работе с сообщениями на стене
 * Этот модуль зависит от модуля Пользователи
 */
public abstract class WallMessageModel implements IWallSenderMessage, IWallReaderMessage {
    public IUser user;
    public String message;
}
