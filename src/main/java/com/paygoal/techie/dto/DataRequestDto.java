package com.paygoal.techie.dto;

import com.paygoal.techie.validation.IntegerValidator;
import com.paygoal.techie.validation.ListValidator;
import com.paygoal.techie.validation.StringValidator;
import lombok.Data;
import java.util.List;

@Data
public class DataRequestDto {

    @StringValidator(message = "Cannot receive this String")
    private String stringToEvaluate;

    @IntegerValidator(message = "Cannot receive this Integer")
    private Integer integerToEvaluate;

    @ListValidator(message = "Cannot receive this List")
    private List<?> listToEvaluate;

}
