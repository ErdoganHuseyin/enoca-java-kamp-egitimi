package com.enoca.rentACar.dataAccess.abstracts;

import com.enoca.rentACar.entities.concretes.Brand;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BrandRepository extends JpaRepository<Brand,Integer>{
List<Brand> findAll();
}
