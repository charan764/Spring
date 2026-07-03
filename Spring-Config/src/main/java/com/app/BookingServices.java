package com.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class BookingServices {
    private TransportServices transportServices;

    @Autowired
    //public BookingServices(TransportServices transportServices){
        //this.transportServices=transportServices;

    public void setTransportServices(TransportServices transportServices){
        this.transportServices=transportServices;

    }
    public void PlaceOrder(){
        System.out.println("Booking has been done Sucessfully");
        transportServices.TransportPartner();
    }

}
