package com.enoca.rentACar.business.abstracts;

import com.enoca.rentACar.business.requests.CreateModelRequest;
import com.enoca.rentACar.business.requests.UpdateModelRequest;
import com.enoca.rentACar.business.responses.GetAllModelsResponse;

import java.util.List;

public interface ModelService {
    List<GetAllModelsResponse> getAll();
    public void add(CreateModelRequest createModelRequest);
    public void update(UpdateModelRequest updateModelRequest);
    public void delete(int id);
}
