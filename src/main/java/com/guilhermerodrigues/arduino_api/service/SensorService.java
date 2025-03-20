package com.guilhermerodrigues.arduino_api.service;

import com.guilhermerodrigues.arduino_api.entity.Sensor;
import com.guilhermerodrigues.arduino_api.repository.SensorRepository;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class SensorService {
    private final Random rand = new Random();
    private final SensorRepository sensorRepository;

    public SensorService(SensorRepository sensorRepository) {
        this.sensorRepository = sensorRepository;
    }

    public Sensor fetch() {
        Sensor sensor = new Sensor(
                rand.nextInt(50) + 10,
                rand.nextInt(100),
                rand.nextInt(200)
        );

        return sensorRepository.save(sensor);
    }
}
