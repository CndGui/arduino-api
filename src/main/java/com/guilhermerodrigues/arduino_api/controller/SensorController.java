package com.guilhermerodrigues.arduino_api.controller;

import com.guilhermerodrigues.arduino_api.entity.Sensor;
import com.guilhermerodrigues.arduino_api.repository.SensorRepository;
import com.guilhermerodrigues.arduino_api.service.SensorService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/sensor")
public class SensorController {
    private final SensorService sensorService;
    private final SensorRepository sensorRepository;

    public SensorController(SensorService sensorService, SensorRepository sensorRepository) {
        this.sensorService = sensorService;
        this.sensorRepository = sensorRepository;
    }

    @PostMapping("/fetch")
    public Sensor fetch() {
        return sensorService.fetch();
    }

    @GetMapping("/fetch")
    public List<Sensor> values() {
        return sensorRepository.findAll();
    }
}
