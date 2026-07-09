package com.enoca.rentACar.business.concretes;

import com.enoca.rentACar.business.abstracts.BrandService;
import com.enoca.rentACar.business.requests.CreateBrandRequest;
import com.enoca.rentACar.business.requests.UpdateBrandRequest;
import com.enoca.rentACar.business.responses.GetAllBrandsResponse;
import com.enoca.rentACar.business.responses.GetByIdBrandsResponse;
import com.enoca.rentACar.business.rules.BrandBusinessRules;
import com.enoca.rentACar.core.utilities.mappers.ModelMapperService;
import com.enoca.rentACar.dataAccess.abstracts.BrandRepository;
import com.enoca.rentACar.entities.concretes.Brand;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
@AllArgsConstructor
//@RequiredArgsConstructor  (Bu anotasyon başlatması zorunlu olan değişkenlerin constructor'unu oluşturur mesela final bir değişkeninkini oluşturuken default bir değişkenne ait constructor oluşturmaz)
public class BrandManager implements BrandService {
//    private final BrandRepository brandRepository;  (bu yapıyı Constructor Injection kullanmak istediğimizde uygulamalıyız)
    private BrandRepository brandRepository;
    private ModelMapperService modelMapperService;
    private BrandBusinessRules brandBusinessRules;
    @Override
     public List<GetAllBrandsResponse> getAll(){
       List<Brand> brands = brandRepository.findAll();
       List<GetAllBrandsResponse> brandsResponses = brands.stream()
               .map(brand -> this.modelMapperService.forResponse().map(brand,GetAllBrandsResponse.class)).toList();
    return brandsResponses;
    }

    @Override
    public void add(CreateBrandRequest createBrandRequest) {
        this.brandBusinessRules.checkIfBrandNameExists(createBrandRequest.getName());
        Brand brand = this.modelMapperService.forRequest().map(createBrandRequest,Brand.class);
        this.brandRepository.save(brand);
    }

    @Override
    public void delete(int id) {
    this.brandRepository.deleteById(id);
    }

    @Override
    public void update(UpdateBrandRequest updateBrandRequest) {
        Brand brand = this.modelMapperService.forRequest().map(updateBrandRequest,Brand.class);
        this.brandRepository.save(brand);
    }

    @Override
    public GetByIdBrandsResponse getById(int id) {
        Brand brand = this.brandRepository.findById(id).orElseThrow();
        GetByIdBrandsResponse getByIdBrandsResponse = modelMapperService.forResponse().map(brand,GetByIdBrandsResponse.class);
        return getByIdBrandsResponse;
    }
}
