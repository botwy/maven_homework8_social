package com.homework8.social_chat;

import com.homework8.social_users.IUser;

/**
 * Модуль chat Интерфейс для работы с отправкой сообщений
 * Этот модуль зависит от модуля Пользователи и модуля Фото
 */
public interface IChatMessageSender {
    void sendMessage(IChat chat);
}
