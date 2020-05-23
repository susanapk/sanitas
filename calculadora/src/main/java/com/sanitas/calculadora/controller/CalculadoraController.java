package com.sanitas.calculadora.controller;

import com.sanitas.calculadora.service.CalculadoraService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

@Slf4j
@RestController
public class CalculadoraController {

    @Autowired
    CalculadoraService CalculadoraService;

    @GetMapping("/sum")
    public ResponseEntity<Number> sum(@RequestParam BigDecimal operator1, @RequestParam BigDecimal operator2){
        log.info("OperatorationController sum ");
        Object result = CalculadoraService.sum(operator1,operator2);
        ResponseEntity response = new ResponseEntity(result, HttpStatus.OK);
        return response;
    }

    @GetMapping("/subtract")
    public ResponseEntity<Number> subtract(@RequestParam BigDecimal operator1, @RequestParam BigDecimal operator2){
        log.info("OperatorationController subtract");
        Object result = CalculadoraService.subtract(operator1,operator2);
        ResponseEntity response = new ResponseEntity(result, HttpStatus.OK);
        return response;
    }
}