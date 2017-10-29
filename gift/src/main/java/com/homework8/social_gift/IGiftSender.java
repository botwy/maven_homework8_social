package com.homework8.social_gift;

import com.homework8.social_users.IUser;

/**
 * Модуль gift Интерфейс для работы с отправкой подарков
 * Этот модуль зависит от модуля Пользователи и модуля Фото
 */
public interface IGiftSender {
    void sendGift(IUser receiver);
}
