package org.CodeForPizza.Uppgift1;

public class Calculator {

    public int add (int a, int b){
        if(a < 0 || b < 0){
            throw new IllegalArgumentException("Negative numbers are not allowed");
        }

        return a + b;
    }

    public int subtract (int a, int b){
        if(a < 0 || b < 0){
            throw new IllegalArgumentException("Negative numbers are not allowed");
        }
        return a - b;
    }

    public int multiply (int a, int b){
        if(a < 0 || b < 0){
            throw new IllegalArgumentException("Negative numbers are not allowed");
        }
        return a * b;
    }

    public int divide (int a, int b){
        if(a < 0 || b < 0){
            throw new IllegalArgumentException("Negative numbers are not allowed");
        }
        if(b == 0 || a == 0){
            throw new IllegalArgumentException("You can't divide by 0");
        }
        return a / b;
    }

}
