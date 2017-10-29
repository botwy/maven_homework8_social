package com.homework8.social_wall;

/**
 * Модуль wall Интерфейс для работы с отправкой сообщений на стену
 * Этот модуль зависит от модуля Пользователи
 */
public interface IWallSenderMessage {
    void sendMessage(String text);
}
