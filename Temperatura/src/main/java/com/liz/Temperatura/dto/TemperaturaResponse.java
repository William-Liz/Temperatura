package com.liz.Temperatura.dto;

public class TemperaturaResponse {

    private double temperatura;
    private String unidade;

    public  TemperaturaResponse(double temperatura, String unidade) {
        this.temperatura = temperatura;
        this.unidade = unidade;
    }
    public double getTemperatura() {
        return temperatura;
    }
    public String getUnidade() {
        return unidade;
    }
}
