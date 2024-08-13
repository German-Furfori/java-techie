package com.paygoal.techie.dto;

import lombok.Data;
import java.util.List;

@Data
public class DataRequestDto {

    private String stringToEvaluate;

    private Integer integerToEvaluate;

    private List<?> listToEvaluate;

}
