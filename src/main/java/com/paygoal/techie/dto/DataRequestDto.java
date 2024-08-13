package com.paygoal.techie.dto;

import com.paygoal.techie.validation.IntegerValidator;
import com.paygoal.techie.validation.ListValidator;
import com.paygoal.techie.validation.StringValidator;
import lombok.Data;
import java.util.List;

@Data
public class DataRequestDto {

    @StringValidator(message = "This String contains more than 5 s")
    private String stringToEvaluate;

    @IntegerValidator(message = "This Integer is not multiple of 10")
    private Integer integerToEvaluate;

    @ListValidator(message = "This List contains more than 5 registers")
    private List<?> listToEvaluate;

}
