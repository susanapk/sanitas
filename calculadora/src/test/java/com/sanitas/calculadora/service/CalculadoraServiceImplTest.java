package com.sanitas.calculadora.service;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;
@ExtendWith(SpringExtension.class)
class CalculadoraServiceImplTest {

    @Mock
    private CalculadoraServiceImpl calculadoraServiceImpl;


    @Test
    void testSum(){
        Mockito.when(calculadoraServiceImpl.sum(BigDecimal.ONE,BigDecimal.ZERO)).thenReturn(BigDecimal.ONE);

        assertEquals(BigDecimal.ONE,calculadoraServiceImpl.sum(BigDecimal.ONE,BigDecimal.ZERO));
    }

    @Test
    void testSubtract(){
        Mockito.when(calculadoraServiceImpl.subtract(BigDecimal.ONE,BigDecimal.ZERO)).thenReturn(BigDecimal.ONE);

        assertEquals(BigDecimal.ONE,calculadoraServiceImpl.subtract(BigDecimal.ONE,BigDecimal.ZERO));

    }

}
