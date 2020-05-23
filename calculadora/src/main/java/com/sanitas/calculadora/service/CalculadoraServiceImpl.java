package com.sanitas.calculadora.service;

import java.math.BigDecimal;
import java.util.stream.Stream;

public class CalculadoraServiceImpl implements CalculadoraService<BigDecimal>{
    public BigDecimal sum(BigDecimal a, BigDecimal b){
        return Stream.of(a,b).reduce(BigDecimal.ZERO, BigDecimal::add);
    }

    public BigDecimal subtract(BigDecimal a, BigDecimal b){
        return a.subtract(b);
    }
}