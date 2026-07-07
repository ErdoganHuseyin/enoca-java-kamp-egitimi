package com.enoca.rentACar.business.concretes;

import com.enoca.rentACar.business.abstracts.BrandService;
import com.enoca.rentACar.dataAccess.abstracts.BrandRepository;
import com.enoca.rentACar.entities.concretes.Brand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BrandManager implements BrandService {
    BrandRepository brandRepository;
@Autowired
    public BrandManager(BrandRepository brandRepository) {
        this.brandRepository = brandRepository;
    }


    @Override
     public List<Brand> getAll(){
       return brandRepository.getAll();
    }

}
