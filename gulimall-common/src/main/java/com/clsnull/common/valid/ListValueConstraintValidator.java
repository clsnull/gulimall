package com.clsnull.common.valid;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.HashSet;
import java.util.Set;

public class ListValueConstraintValidator implements ConstraintValidator<ListValue, Integer> {

    private Set<Integer> set = new HashSet();
    @Override
    public void initialize(ListValue constraintAnnotation) {
        ConstraintValidator.super.initialize(constraintAnnotation);
        int[] vals = constraintAnnotation.vals();
        for (int i = 0; i < vals.length; i++) {
            set.add(vals[i]);
        }
    }

    @Override
    public boolean isValid(Integer integer, ConstraintValidatorContext constraintValidatorContext) {
        return set.contains(integer);
    }
}
