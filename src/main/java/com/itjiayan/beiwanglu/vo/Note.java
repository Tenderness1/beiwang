package com.itjiayan.beiwanglu.vo;

import java.util.Date;

public class Note {

    private String id;
    private String context;
    private Date beginTime;
    private Date endTime;

    @Override
    public String toString() {
        return "Note{" +
                "id='" + id + '\'' +
                ", context='" + context + '\'' +
                ", beginTime=" + beginTime +
                ", endTime=" + endTime +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }

    public Date getBeginTime() {
        return beginTime;
    }

    public void setBeginTime(Date beginTime) {
        this.beginTime = beginTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }
}
