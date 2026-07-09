package com.enoca.rentACar.webApi.controllers;

import com.enoca.rentACar.business.abstracts.CarService;
import com.enoca.rentACar.business.requests.CreateCarRequest;
import com.enoca.rentACar.business.requests.UpdateCarRequest;
import com.enoca.rentACar.business.responses.GetAllCarsResponse;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/cars")
@RequiredArgsConstructor
public class CarController {
     private final CarService carService;

     @GetMapping
    List<GetAllCarsResponse> getAll(){
        return this.carService.getAll();
     }

     @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    public void add(@RequestBody @Valid CreateCarRequest createCarRequest){
         this.carService.add(createCarRequest);
     }

     @PutMapping
    public void update(@RequestBody UpdateCarRequest updateCarRequest){
         this.carService.update(updateCarRequest);
     }

     @DeleteMapping("/{id}")
    public void delete(@PathVariable int id){
         this.carService.delete(id);
     }


}
