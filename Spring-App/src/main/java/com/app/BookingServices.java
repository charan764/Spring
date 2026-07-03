package com.app;

import org.springframework.stereotype.Component;

@Component
public class BookingServices {
     TransportServices transportServices;

    public BookingServices(TransportServices transportServices){
        this.transportServices= transportServices;
    }

    public void PlaceOrder(){
        System.out.println("Booking has been done Successfully");
        transportServices.TransportPartner();
    }

}
