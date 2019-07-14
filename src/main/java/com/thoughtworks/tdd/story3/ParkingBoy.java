package com.thoughtworks.tdd.story3;

/**
 * Created by 桐爷哥 on 2019/7/13.
 */
public class ParkingBoy {
    ParkingLot parkingLot = new ParkingLot();
    public Ticket park(Car car) {
        return parkingLot.getTicketByCar(car);
    }

    public Car fetch(Ticket ticket) {
        return parkingLot.getCarByTicket(ticket);
    }

    public String query() {
        return parkingLot.queryMessage();
    }
}
