package com.thoughtworks.tddintro.exercises.factorial;

public class Factorial {
    public Integer compute (int i) {
        if(i < 0){
            throw new IllegalArgumentException("Number must be positive");
        }
        if(i > 0){
            return i * compute(i-1);
        } else {
            return 1;
        }
    }
}
