package com.nearsoft.acedemy.tourfileuploader.service;

import org.springframework.stereotype.Component;

@Component
public class TourDetails {

    private int numberOfFlight;
    private int numberOfReservation;
    private String destination;
    private String hotelName;

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public void setNumberOfFlight(int numberOfFlight) {
        this.numberOfFlight = numberOfFlight;
    }

    public void setNumberOfReservation(int numberOfReservation) {
        this.numberOfReservation = numberOfReservation;
    }

    public int getNumberOfFlight() {
        return numberOfFlight;
    }
}
