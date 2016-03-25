package com.blanke.solebook.bean;

import android.os.Parcel;

import com.avos.avoscloud.AVUser;

/**
 * Created by blanke on 16-2-21.
 */
public class SoleUser extends AVUser {
    public static final String NICKNAME = "nickname";
    public static final String ICONURL = "iconurl";

    public String getNickname() {
        return getString(NICKNAME);
    }

    public static String getNickname(AVUser user) {
        return user.getString(NICKNAME);
    }

    public void setNickname(String nickname) {
        put(NICKNAME, nickname);
    }

    public String getIconurl() {
        return getString(ICONURL);
    }

    public static String getIconurl(AVUser user) {
        return user.getString(ICONURL);
    }

    public void setIconurl(String iconurl) {
        put(ICONURL, iconurl);
    }

    public SoleUser() {
    }

    public SoleUser(Parcel in) {
        super(in);
    }
}
