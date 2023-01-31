package com.martin;

public class Calculadora {

    public Double calcular(Double a, Double b) {
        Double d = Math.sqrt(a * a - b * b);

        return b * b / 2;
    }

    public Double multiply(Double a, Double b) {
        return a * b;
    }

    public Double divide(Double a, Double b) throws DivisionByZeroException {
        if (b == 0) {
            throw new DivisionByZeroException("Second parameter was 0. This is not allowed!");
        }
        return a / b;
    }

    public Double abs(Double number) {
        if (number >= 0) {
            return number;
        }
        return -number;
    }

    public Double abs_test(Double number) {
        return Math.abs(number);
    }
}
