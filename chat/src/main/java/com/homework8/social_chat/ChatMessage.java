package com.homework8.social_chat;

import com.homework8.social_chat.domain.ChatMessageModel;
import com.homework8.social_users.IUser;

/**
 * Модуль chat Конкретная реализация созданя и отправки сообщений в чат
 * Этот модуль зависит от модуля Пользователи и модуля Фото
 */
public class ChatMessage extends ChatMessageModel{


    public void sendMessage(IChat chat) {
        chat.addMessage(this);
    }
}
