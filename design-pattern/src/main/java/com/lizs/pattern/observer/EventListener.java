package com.lizs.pattern.observer;

import java.lang.reflect.Method;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EventListener {

    private static Map<EventType, Event> events = new HashMap<>();

    public static void addListener(EventType eventType, Callback callback) {
        Event event;
        if (events.containsKey(eventType)) {
            event = events.get(eventType);
        } else {
            event = new Event();
            event.setTrigger(eventType.name());
            events.put(eventType, event);
        }
        event.addCallback(callback);
    }

    public static void trigger(EventType eventType) {
        if (events.containsKey(eventType)) {
            Event event = events.get(eventType);
            event.setDate(new Date());
            List<Callback> callbacks = event.getCallbacks();
            callbacks.forEach(callback -> {
                Object target = callback.getTarget();
                Method method = callback.getMethod();
                try {
                    method.invoke(target,event);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            });
        }
    }
}


