package com.thoughtworks.tdd.story2;

import java.util.HashMap;
import java.util.Map;

public class ParkingLot {
    Map<Ticket, Car> parkingInfo = new HashMap<>();
    private final int TOTALPARKINGCOUNT = 10;
    private String message = "";

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
        if(!parkingInfo.containsKey(ticket))
            message = "Unrecognized parking ticket.";
        return parkingInfo.remove(ticket);
    }

    public String queryMessage() {
        String string = message;
        message = "";
        return string;
    }
}
