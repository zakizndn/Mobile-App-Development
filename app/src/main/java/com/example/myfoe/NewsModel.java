package com.example.myfoe;

import java.sql.Struct;

public class NewsModel {
    private String title, intro, date, time, venue;

    public NewsModel() {
    }

    public NewsModel(String title, String intro, String date, String time, String venue) {
        this.title = title;
        this.intro = intro;
        this.date = date;
        this.time = time;
        this.venue = venue;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getIntro() {
        return intro;
    }

    public void setIntro(String intro) {
        this.intro = intro;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getVenue() {
        return venue;
    }

    public void setVenue(String venue) {
        this.venue = venue;
    }

}
