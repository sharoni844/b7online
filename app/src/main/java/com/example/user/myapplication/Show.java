package com.example.user.myapplication;

/**
 * Created by User on 15/11/2016.
 */

public class Show {
    String type;
    String title;
    int startTime;

    public Show(String type, String title, int startTime) {
        this.type = type;
        this.title = title;
        this.startTime = startTime;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getStartTime() {
        return startTime;
    }

    public void setStartTime(int startTime) {
        this.startTime = startTime;
    }
}
