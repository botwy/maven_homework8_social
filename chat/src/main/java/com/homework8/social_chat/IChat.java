package com.homework8.social_chat;

/**
 * Модуль chat Интерфейс для работы с чатом
 * Этот модуль зависит от модуля Пользователи и модуля Фото
 */
public interface IChat {
    boolean addMessage(IChatMessageSender msg);
}
