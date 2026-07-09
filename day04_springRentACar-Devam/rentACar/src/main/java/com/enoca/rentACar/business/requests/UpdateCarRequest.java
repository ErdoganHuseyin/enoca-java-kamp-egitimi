package com.enoca.rentACar.business.requests;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UpdateCarRequest {

    private String name;
    private int modelId;
    private int id;
    private String plate;
    private double dailyPrice;
    private int modelYear;
    private int state;
}
