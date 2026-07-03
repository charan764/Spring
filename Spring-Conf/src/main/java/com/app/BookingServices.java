package com.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


@Component
public class BookingServices {
    @Autowired
    @Qualifier("uber")
    TransportServices transportServices;

    //@Autowired
    //@Qualifier("uber")
    //public BookingServices(TransportServices transportServices){
          //this.transportServices=transportServices;

    //public void setTransportServices(TransportServices transportServices){
        //this.transportServices=transportServices;


    public void PlaceOrder(){
        System.out.println("Booking has been done Sucessfully");
        transportServices.TransportPartner();
    }

}

