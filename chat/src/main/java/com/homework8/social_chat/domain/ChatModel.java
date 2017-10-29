package com.homework8.social_chat.domain;

import com.homework8.social_chat.*;
import com.homework8.social_users.IUser;

import java.util.ArrayList;
import java.util.List;

/**
 * Модуль chat Абстрактная модель работы с чатом
 * Этот модуль зависит от модуля Пользователи и модуля Фото
 */
public abstract class ChatModel implements IChat, IChatRemover {
    private String id;
    private IUser user_receiver;
    private IUser user_sender;
    List<ChatMessage> list_message;

    public boolean addMessage(IChatMessageSender msg) {
        this.list_message.add((ChatMessage) msg);
        return true;
    }
}
