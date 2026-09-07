package com.liz.Temperatura.dto;

public class TemperaturaRequest {

    private double temperatura;
    private String de;
    private String para;

    public TemperaturaRequest(){

    }
    public TemperaturaRequest(double temperatura, String de, String para) {
        this.temperatura = temperatura;
    }

    public double getTemperatura() {
        return temperatura;
    }
    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
    }
    public String getDe() {
        return de;
    }
    public void setDe(String de) {
        this.de = de;
    }
    public String getPara() {
        return para;
    }
    public void setPara(String para) {
        this.para = para;
    }
}
