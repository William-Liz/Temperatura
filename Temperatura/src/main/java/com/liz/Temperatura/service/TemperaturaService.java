package com.liz.Temperatura.service;

import com.liz.Temperatura.dto.TemperaturaRequest;
import com.liz.Temperatura.dto.TemperaturaResponse;
import org.springframework.stereotype.Service;

@Service
public class TemperaturaService {

    public TemperaturaResponse converter(TemperaturaRequest temperaturaRequest) {
        double temperatura = temperaturaRequest.getTemperatura();
        String de = temperaturaRequest.getDe().toUpperCase();
        String para = temperaturaRequest.getPara().toUpperCase();

        double resultado = 0;

        //C para F
        if (de.equals("C") && para.equals("F")) {
            resultado = (temperatura * 9/5) + 32;
        }
        //F para C
        else if (de.equals("F") && para.equals("C")) {
            resultado = (temperatura - 32)*5/9;
        }
        //C para K
        else if (de.equals("C") && para.equals("K")) {
            resultado = temperatura + 273.15;
        }
        //K para C
        else if (de.equals("K") && para.equals("C")) {
            resultado = temperatura - 273.15;
        }
        //F para K
        else if (de.equals("F") && para.equals("K")) {
            resultado = (temperatura -32)*5/9+273.15;
        }
        //K para F
        else if (de.equals("K") && para.equals("F")) {
            resultado = (temperatura - 273.15)*9/5+32;
        }
        else {
            System.out.println("Unidade invalida!");
        }
        return new TemperaturaResponse(resultado, para);
    }
}
