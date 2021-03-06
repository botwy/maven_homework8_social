package com.homework8.social_gift.domain;

import com.homework8.social_gift.IGift;
import com.homework8.social_gift.IGiftSender;
import com.homework8.social_photo.domain.PhotoModel;
import com.homework8.social_users.IUser;

/**
 * Модуль gift Абстрактная модель Подарки
 * Этот модуль зависит от модуля Пользователи и модуля Фото
 */
public abstract class GiftModel implements IGift, IGiftSender {
    private String id;
    private IUser sender;
    private IUser reciever;
    private PhotoModel photo;

}
