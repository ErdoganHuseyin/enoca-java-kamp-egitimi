package com.enoca.rentACar.business.responses;

import com.enoca.rentACar.entities.concretes.Model;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetAllCarsResponse {
private String name;
private int id;
private String plate;
private double dailyPrice;
private int modelYear;
private int state;
private String modelName;
}
