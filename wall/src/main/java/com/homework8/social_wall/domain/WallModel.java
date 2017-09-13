package com.homework8.social_wall.domain;

import com.homework8.social_users.IUser;
import com.homework8.social_wall.IWallReadMessages;
import com.homework8.social_wall.IWallSendMessage;

import java.util.List;

public abstract class WallModel implements IWallReadMessages,IWallSendMessage {
    private String id;
    private List<WallMessagesModel> messages;
    private IUser user_owner;

}
