package com.homework8.social_wall;

import com.homework8.social_wall.domain.WallMessageModel;

import java.util.List;

public interface IWallAllMessagesHandler {
    List<WallMessageModel> getList_messages();
}
