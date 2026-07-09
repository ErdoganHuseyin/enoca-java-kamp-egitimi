package com.enoca.rentACar.dataAccess.abstracts;

import com.enoca.rentACar.entities.concretes.Car;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarRepository extends JpaRepository<Car,Integer> {
}
