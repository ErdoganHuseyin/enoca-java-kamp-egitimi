package com.enoca.rentACar.webApi.controllers;

import com.enoca.rentACar.business.abstracts.BrandService;
import com.enoca.rentACar.business.requests.CreateBrandRequest;
import com.enoca.rentACar.business.requests.UpdateBrandRequest;
import com.enoca.rentACar.business.responses.GetAllBrandsResponse;
import com.enoca.rentACar.business.responses.GetByIdBrandsResponse;
import com.enoca.rentACar.entities.concretes.Brand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
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
 @GetMapping()
    public List<GetAllBrandsResponse> getAll(){
        return brandService.getAll();
    }

    @PostMapping()
    @ResponseStatus(code= HttpStatus.CREATED)
    public void add(@RequestBody CreateBrandRequest createBrandRequest){
        this.brandService.add(createBrandRequest);
    }

   @GetMapping("/{id}")
    public GetByIdBrandsResponse getById(@PathVariable int id){
    return brandService.getById(id);
   }

   @PutMapping
    public void update(@RequestBody UpdateBrandRequest updateBrandRequest){
    this.brandService.update(updateBrandRequest);
   }

   @DeleteMapping("/{id}")
    public void delete(@PathVariable int id){
    this.brandService.delete(id);
   }


}

