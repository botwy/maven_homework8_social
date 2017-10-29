package com.homework8.social_chat.domain;

import com.homework8.social_chat.IChatMessage;
import com.homework8.social_chat.IChatMessageSender;
import com.homework8.social_photo.IPhoto;

/**
 * Модуль chat Абстрактная модель работы с сообщениями
 * Этот модуль зависит от модуля Пользователи и модуля Фото
 */
public abstract class ChatMessageModel implements IChatMessage,IChatMessageSender {
    private String id;
    private String text;
    private IPhoto photo;
}
