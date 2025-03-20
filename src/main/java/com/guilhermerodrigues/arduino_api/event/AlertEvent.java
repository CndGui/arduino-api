package com.guilhermerodrigues.arduino_api.event;

import org.springframework.context.ApplicationEvent;

public class AlertEvent extends ApplicationEvent {
    private String message;

    public AlertEvent(Object source, String message) {
        super(source);
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
