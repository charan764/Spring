package com.app;

import org.springframework.stereotype.Component;


public class Uber implements TransportServices{
    public void TransportPartner(){
        System.out.println("Transporation done in uber");
    }
}
