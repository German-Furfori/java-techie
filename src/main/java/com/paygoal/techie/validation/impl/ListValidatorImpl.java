package com.paygoal.techie.validation.impl;

import com.paygoal.techie.validation.ListValidator;
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.List;

public class ListValidatorImpl implements ConstraintValidator<ListValidator, List<?>> {

    @Override
    public boolean isValid(List<?> objects, ConstraintValidatorContext constraintValidatorContext) {
        return objects.size() < 5;
    }

}