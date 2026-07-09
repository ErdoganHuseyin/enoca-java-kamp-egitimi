package com.enoca.rentACar.dataAccess.abstracts;

import com.enoca.rentACar.entities.concretes.Model;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ModelRepository extends JpaRepository<Model,Integer> {
}
