package com.sanitas.calculadora.controller;

import com.sanitas.calculadora.service.CalculadoraService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;

import java.math.BigDecimal;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@ExtendWith(SpringExtension.class)
@WebMvcTest(CalculadoraController.class)
class CalculadoraControllerTest {
    @Autowired
    private MockMvc mvc;

    @MockBean
    private CalculadoraService calculadoraService;

    CalculadoraControllerTest() {
    }

    @Test
    void sum() throws Exception {

        Mockito.when(calculadoraService.sum(1L,1L)).thenReturn(2L);

        mvc.perform(get("/sum?operator1=1&operator2=1")
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk());
    }

    @Test
    void subtract() throws Exception {

        Mockito.when(calculadoraService.subtract(1L,1L)).thenReturn(BigDecimal.ZERO);

        mvc.perform(get("/subtract?operator1=1&operator2=1")
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk());
    }


}
