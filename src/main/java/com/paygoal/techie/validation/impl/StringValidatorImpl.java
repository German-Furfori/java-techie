package com.paygoal.techie.validation.impl;

import com.paygoal.techie.validation.StringValidator;
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class StringValidatorImpl implements ConstraintValidator<StringValidator, String> {

    @Override
    public boolean isValid(String s, ConstraintValidatorContext constraintValidatorContext) {
        return s.chars().filter(ch -> ch == 's' || ch == 'S').count() < 6;
    }

}