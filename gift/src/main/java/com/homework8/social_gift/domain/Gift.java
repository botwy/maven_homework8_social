package com.homework8.social_gift.domain;

import com.homework8.social_gift.IGiftSender;
import com.homework8.social_photo.domain.Photo;
import com.homework8.social_users.IUser;

public abstract class Gift implements IGiftSender {
    private String id;
    private IUser sender;
    private IUser reciever;
    private Photo photo;

}
