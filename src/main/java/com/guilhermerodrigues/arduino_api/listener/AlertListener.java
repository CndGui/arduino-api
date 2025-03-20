package com.guilhermerodrigues.arduino_api.listener;

import com.guilhermerodrigues.arduino_api.event.AlertEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class AlertListener {
    @EventListener
    public void onAlertEvent(AlertEvent alertEvent) {
        System.out.println("[ALERT] " + alertEvent.getMessage());
    }
}
