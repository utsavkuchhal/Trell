package com.example.trell.model;

public class Categories {

    String title;
    Integer image;

    public Categories(String title, Integer image) {
        this.title = title;
        this.image = image;
    }

    public Integer getImage() {
        return image;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
