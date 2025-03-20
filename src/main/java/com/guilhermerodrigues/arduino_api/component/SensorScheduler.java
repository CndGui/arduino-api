package com.guilhermerodrigues.arduino_api.component;

import com.guilhermerodrigues.arduino_api.entity.Sensor;
import com.guilhermerodrigues.arduino_api.service.AlertService;
import com.guilhermerodrigues.arduino_api.service.SensorService;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class SensorScheduler {
    private final SensorService sensorService;
    private final AlertService alertService;

    public SensorScheduler(SensorService sensorService, AlertService alertService) {
        this.sensorService = sensorService;
        this.alertService = alertService;
    }

    @Scheduled(fixedRate = 2000)
    public void schedule() {
        Sensor data = sensorService.fetch();
        System.out.println(data.getTemperature() + ", " + data.getHumidity() + ", " + data.getBrightness());

        alertService.verifyAlert(data);
    }
}
