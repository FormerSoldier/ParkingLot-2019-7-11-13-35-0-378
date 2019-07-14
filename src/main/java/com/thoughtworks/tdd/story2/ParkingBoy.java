package com.thoughtworks.tdd.story2;

/**
 * Created by 桐爷哥 on 2019/7/13.
 */
public class ParkingBoy {
    ParkingLot firstParkingLot = new ParkingLot();
    ParkingLot secondParkingLot = new ParkingLot();
    public Ticket park(Car car) {
        if (!firstParkingLot.isFull())
            return firstParkingLot.getTicketByCar(car);
        else
            return secondParkingLot.getTicketByCar(car);
    }

    public Car fetch(Ticket ticket) {
        return firstParkingLot.getCarByTicket(ticket);
    }

    public String query() {
        return firstParkingLot.queryMessage();
    }
}
