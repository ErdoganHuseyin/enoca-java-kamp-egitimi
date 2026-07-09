package com.enoca.rentACar.business.abstracts;

import com.enoca.rentACar.business.requests.CreateBrandRequest;
import com.enoca.rentACar.business.requests.UpdateBrandRequest;
import com.enoca.rentACar.business.responses.GetAllBrandsResponse;
import com.enoca.rentACar.business.responses.GetByIdBrandsResponse;
import com.enoca.rentACar.entities.concretes.Brand;

import java.util.List;

public interface    BrandService {
    List<GetAllBrandsResponse> getAll();
    GetByIdBrandsResponse getById(int id);
    void add(CreateBrandRequest createBrandRequest);
    void update(UpdateBrandRequest updateBrandRequest);
    void delete(int id);
}
