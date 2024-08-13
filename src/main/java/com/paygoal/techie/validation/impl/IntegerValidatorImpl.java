package com.paygoal.techie.validation.impl;

import com.paygoal.techie.validation.IntegerValidator;
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class IntegerValidatorImpl implements ConstraintValidator<IntegerValidator, Integer> {

    @Override
    public boolean isValid(Integer integer, ConstraintValidatorContext constraintValidatorContext) {
        return integer % 10 == 0;
    }

}