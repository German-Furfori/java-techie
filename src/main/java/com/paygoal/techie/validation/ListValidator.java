package com.paygoal.techie.validation;

import com.paygoal.techie.validation.impl.ListValidatorImpl;
import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Documented
@Constraint(validatedBy = ListValidatorImpl.class)
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface ListValidator {

    String message();

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};

}
