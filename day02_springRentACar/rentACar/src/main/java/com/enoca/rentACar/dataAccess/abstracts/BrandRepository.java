package com.enoca.rentACar.dataAccess.abstracts;

import com.enoca.rentACar.entities.concretes.Brand;

import java.util.List;

public interface BrandRepository {
List<Brand> getAll();
}
