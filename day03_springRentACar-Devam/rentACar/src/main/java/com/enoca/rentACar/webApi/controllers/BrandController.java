package com.enoca.rentACar.webApi.controllers;

import com.enoca.rentACar.business.abstracts.BrandService;
import com.enoca.rentACar.business.requests.CreateBrandRequest;
import com.enoca.rentACar.business.responses.GetAllBrandsResponse;
import com.enoca.rentACar.entities.concretes.Brand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/brands")
public class BrandController {
    private BrandService brandService;
@Autowired
    public BrandController(BrandService brandService) {
        this.brandService = brandService;
    }
 @GetMapping("/getall")
    public List<GetAllBrandsResponse> getAll(){
        return brandService.getAll();
    }

    @PostMapping("/add")
    public void add(@RequestBody CreateBrandRequest createBrandRequest){
        this.brandService.add(createBrandRequest);
    }
}

