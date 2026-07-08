package com.enoca.rentACar.business.concretes;

import com.enoca.rentACar.business.abstracts.BrandService;
import com.enoca.rentACar.dataAccess.abstracts.BrandRepository;
import com.enoca.rentACar.entities.concretes.Brand;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
//@RequiredArgsConstructor  (Bu anotasyon başlatması zorunlu olan değişkenlerin constructor'unu oluşturur mesela final bir değişkeninkini oluşturuken default bir değişkenne ait constructor oluşturmaz)
public class BrandManager implements BrandService {
//    private final BrandRepository brandRepository;  (bu yapıyı Constructor Injection kullanmak istediğimizde uygulamalıyız)
    BrandRepository brandRepository;
@Autowired
    public BrandManager(BrandRepository brandRepository) {
        this.brandRepository = brandRepository;
    }


    @Override
     public List<Brand> getAll(){
       return brandRepository.findAll();
    }

}
