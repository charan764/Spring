package com.app;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("uber")
public class Uber implements TransportServices{
    @Override
    public void TransportPartner() {
        System.out.println("Transportation done in Uber");
    }
}

