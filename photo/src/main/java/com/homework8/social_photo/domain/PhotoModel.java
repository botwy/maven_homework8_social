package com.homework8.social_photo.domain;

import com.homework8.social_photo.IPhoto;

public abstract class PhotoModel implements IPhoto{
    private String id;
    private String file_name;

    public PhotoModel(String id, String file_name) {
        this.id = id;
        this.file_name = file_name;
    }

    public String getFile_name() {
        return file_name;
    }
}
