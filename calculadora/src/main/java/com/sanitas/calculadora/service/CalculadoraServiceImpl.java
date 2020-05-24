package com.sanitas.calculadora.service;


import io.corp.calculator.TracerImpl;

import java.math.BigDecimal;
import java.util.stream.Stream;

public class CalculadoraServiceImpl implements CalculadoraService<BigDecimal>{
    TracerImpl tracerImpl = new TracerImpl();

    public BigDecimal sum(BigDecimal a, BigDecimal b){
        tracerImpl.trace("sum " + a + " " +b);
        return Stream.of(a,b).reduce(BigDecimal.ZERO, BigDecimal::add);
    }

    public BigDecimal subtract(BigDecimal a, BigDecimal b){
        tracerImpl.trace("subtract " + a + " " +b);
        return a.subtract(b);
    }
}