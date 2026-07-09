package com.enoca.rentACar.webApi.controllers;

import com.enoca.rentACar.business.abstracts.ModelService;
import com.enoca.rentACar.business.requests.CreateModelRequest;
import com.enoca.rentACar.business.requests.UpdateModelRequest;
import com.enoca.rentACar.business.responses.GetAllModelsResponse;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/models")
@RequiredArgsConstructor
public class ModelController {
    private final ModelService modelService;
@GetMapping
    List<GetAllModelsResponse> getAll(){
        return this.modelService.getAll();
    }

@PostMapping
@ResponseStatus(code = HttpStatus.CREATED)
    public void add(@RequestBody @Valid CreateModelRequest createModelRequest){
        this.modelService.add(createModelRequest);
    }

@PutMapping
    public void update(@RequestBody UpdateModelRequest updateModelRequest){
    this.modelService.update(updateModelRequest);
}

@DeleteMapping("/{id}")
    public void delete(@PathVariable int id){
    this.modelService.delete(id);
}


}
