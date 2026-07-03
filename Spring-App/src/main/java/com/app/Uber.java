package com.app;

import org.springframework.stereotype.Component;

@Component("uber")
public class Uber implements TransportServices{
    public void TransportPartner(){
            System.out.println("Transporation done in Uber");
    }
}


