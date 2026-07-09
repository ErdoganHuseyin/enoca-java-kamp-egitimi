package com.enoca.rentACar.business.abstracts;

import com.enoca.rentACar.business.requests.CreateCarRequest;
import com.enoca.rentACar.business.requests.UpdateCarRequest;
import com.enoca.rentACar.business.responses.GetAllCarsResponse;

import java.util.List;

public interface CarService {
    List<GetAllCarsResponse> getAll();
    public void add(CreateCarRequest createCarRequest);
    public void update(UpdateCarRequest updateCarRequest);
    public void delete(int id);
}
