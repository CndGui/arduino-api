package com.guilhermerodrigues.arduino_api.service;

import com.guilhermerodrigues.arduino_api.entity.Sensor;
import com.guilhermerodrigues.arduino_api.event.AlertEvent;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;

@Service
public class AlertService {
    private boolean temperatureAlerted = false;
    private boolean humidityAlerted = false;
    private boolean brightnessAlerted = false;

    private final ApplicationEventPublisher eventPublisher;

    public AlertService(ApplicationEventPublisher eventPublisher) {
        this.eventPublisher = eventPublisher;
    }

    private void sendAlert(String message) {
        eventPublisher.publishEvent(new AlertEvent(this, message));
    }

    public void verifyAlert(Sensor sensor) {
        int temperature = sensor.getTemperature();
        int humidity = sensor.getHumidity();
        int brightness = sensor.getBrightness();

        if (temperature > 32 && !temperatureAlerted) {
            sendAlert("A temperatura esta muito alta!");
            temperatureAlerted = true;
        } else if (temperature <= 32) {
            temperatureAlerted = false;
        }
        
        if (humidity < 20 && !humidityAlerted) {
            sendAlert("A umidade esta muito baixa!");
            humidityAlerted = true;
        } else if (humidity >= 20) {
            humidityAlerted = false;
        }

        if (brightness < 10 && !brightnessAlerted) {
            sendAlert("A luminosidade esta muito baixa!");
            brightnessAlerted = true;
        } else if (brightness >= 10) {
            brightnessAlerted = false;
        }
    }
}
