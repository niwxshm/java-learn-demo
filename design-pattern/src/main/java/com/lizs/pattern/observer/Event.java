package com.lizs.pattern.observer;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Event {

    public Object source;
    public List<Callback> callbacks;
    public String trigger;
    public Date date;

    public Event() {
        callbacks = new ArrayList<>();
    }

    public void addCallback(Callback callback) {
        callbacks.add(callback);
    }

    public List<Callback> getCallbacks() {
        return callbacks;
    }

    public Object getSource() {
        return source;
    }

    public void setSource(Object source) {
        this.source = source;
    }


    public String getTrigger() {
        return trigger;
    }

    public void setTrigger(String trigger) {
        this.trigger = trigger;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Event{" +
                "source=" + source +
                ", callbacks=" + callbacks +
                ", trigger='" + trigger + '\'' +
                ", date=" + date +
                '}';
    }
}
