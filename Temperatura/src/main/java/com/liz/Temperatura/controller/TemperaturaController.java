package com.liz.Temperatura.controller;

import com.liz.Temperatura.dto.TemperaturaRequest;
import com.liz.Temperatura.dto.TemperaturaResponse;
import com.liz.Temperatura.service.TemperaturaService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/temperatura")
public class TemperaturaController {

    private final TemperaturaService service;

    public TemperaturaController(TemperaturaService service) {
        this.service = service;
    }

    @PostMapping("converter")
    public TemperaturaResponse converter(@RequestBody TemperaturaRequest temperaturaRequest) {
        return service.converter(temperaturaRequest);
    }
}
