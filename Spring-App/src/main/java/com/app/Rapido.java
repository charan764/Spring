package com.app;

import org.springframework.stereotype.Component;

@Component("rapido")
public class Rapido implements TransportServices{
    public void TransportPartner(){
        System.out.println("Transporation done in Rapido");
    }
}
