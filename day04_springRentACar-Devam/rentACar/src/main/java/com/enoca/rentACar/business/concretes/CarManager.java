package com.enoca.rentACar.business.concretes;

import com.enoca.rentACar.business.abstracts.CarService;
import com.enoca.rentACar.business.requests.CreateCarRequest;
import com.enoca.rentACar.business.requests.UpdateCarRequest;
import com.enoca.rentACar.business.responses.GetAllCarsResponse;
import com.enoca.rentACar.core.utilities.mappers.ModelMapperService;
import com.enoca.rentACar.dataAccess.abstracts.CarRepository;
import com.enoca.rentACar.entities.concretes.Car;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@AllArgsConstructor
public class CarManager implements CarService {
        private CarRepository carRepository;
        private ModelMapperService modelMapperService;



    @Override
    public void add(CreateCarRequest createCarRequest) {
        Car car = modelMapperService.forRequest().map(createCarRequest, Car.class);
        carRepository.save(car);
    }

    @Override
    public List<GetAllCarsResponse> getAll() {
        List<Car> cars = carRepository.findAll();
        List<GetAllCarsResponse> carsResponses = cars.stream()
                .map(car -> modelMapperService.forResponse().map(car, GetAllCarsResponse.class)).toList();
        return carsResponses;
    }

    @Override
    public void update(UpdateCarRequest updateCarRequest) {
    Car car = modelMapperService.forRequest().map(updateCarRequest, Car.class);
    this.carRepository.save(car);
    }

    @Override
    public void delete(int id) {
        this.carRepository.deleteById(id);
    }
}
