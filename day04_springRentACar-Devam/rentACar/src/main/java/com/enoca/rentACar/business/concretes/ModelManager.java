package com.enoca.rentACar.business.concretes;

import com.enoca.rentACar.business.abstracts.ModelService;
import com.enoca.rentACar.business.requests.CreateModelRequest;
import com.enoca.rentACar.business.requests.UpdateModelRequest;
import com.enoca.rentACar.business.responses.GetAllModelsResponse;
import com.enoca.rentACar.core.utilities.mappers.ModelMapperService;
import com.enoca.rentACar.dataAccess.abstracts.BrandRepository;
import com.enoca.rentACar.dataAccess.abstracts.ModelRepository;
import com.enoca.rentACar.entities.concretes.Model;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@AllArgsConstructor
public class ModelManager implements ModelService{
        private ModelRepository modelRepository;
        private ModelMapperService modelMapperService;

    @Override
    public void delete(int id) {
        this.modelRepository.deleteById(id);
    }

    @Override
    public void update(UpdateModelRequest updateModelRequest) {
        Model model = modelMapperService.forRequest().map(updateModelRequest, Model.class);
        this.modelRepository.save(model);
    }

    @Override
    public void add(CreateModelRequest createModelRequest) {
        Model model = modelMapperService.forRequest().map(createModelRequest, Model.class);
        this.modelRepository.save(model);
    }

    @Override
    public List<GetAllModelsResponse> getAll() {
        List<Model> models = this.modelRepository.findAll();
        List<GetAllModelsResponse> getAllModelsResponses = models.stream()
                .map(model -> modelMapperService.forResponse().map(model, GetAllModelsResponse.class)).toList();
        return getAllModelsResponses;
    }
}
