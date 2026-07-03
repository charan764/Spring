package com.app;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("rapido")
@Primary
public class Rapido implements TransportServices{
    @Override
    public void TransportPartner(){
        System.out.println("Transportation done in Rapido");
    }
}