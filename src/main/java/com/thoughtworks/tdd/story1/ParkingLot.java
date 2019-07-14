package com.thoughtworks.tdd.story1;

import java.util.HashMap;
import java.util.Map;

public class ParkingLot {
    Map<Ticket, Car> parkingInfo = new HashMap<>();
    private final int TOTALPARKINGCOUNT = 10;
    public Ticket getTicketByCar(Car car) {
        if(TOTALPARKINGCOUNT == parkingInfo.size())
            return null;
        if(parkingInfo.values().contains(car))
            return null;
        if(car == null)
            return null;

        Ticket ticket = new Ticket();
        parkingInfo.put(ticket,car);
        return ticket;
    }

    public Car getCarByTicket(Ticket ticket) {
        return parkingInfo.remove(ticket);
    }
}
