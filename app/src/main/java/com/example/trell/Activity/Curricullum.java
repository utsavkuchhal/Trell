package com.example.trell.Activity;

public class Curricullum {

    String title;
    String lectureTime;
    String lectures;

    public Curricullum(String title, String lectureTime, String lectures) {
        this.title = title;
        this.lectureTime = lectureTime;
        this.lectures = lectures;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getLectureTime() {
        return lectureTime;
    }

    public void setLectureTime(String lectureTime) {
        this.lectureTime = lectureTime;
    }

    public String getLectures() {
        return lectures;
    }

    public void setLectures(String lectures) {
        this.lectures = lectures;
    }
}
