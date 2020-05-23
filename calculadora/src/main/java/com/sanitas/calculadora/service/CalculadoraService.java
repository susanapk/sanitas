package com.sanitas.calculadora.service;

public interface CalculadoraService<T> {
    T sum(T a, T b);
    T subtract(T a, T b);
}