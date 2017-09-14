package com.homework8.social_chat;

import com.homework8.social_chat.domain.ChatMessageModel;
import com.homework8.social_users.IUser;

public class ChatMessage extends ChatMessageModel{


    public void sendMessage(IChat chat) {
        chat.addMessage(this);
    }
}
