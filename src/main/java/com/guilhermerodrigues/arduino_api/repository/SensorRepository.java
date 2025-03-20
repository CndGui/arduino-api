package com.guilhermerodrigues.arduino_api.repository;

import com.guilhermerodrigues.arduino_api.entity.Sensor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SensorRepository extends JpaRepository<Sensor, Integer> {
}
