package com.thoughtworks.tdd.story;

public class SmartParkingBoy extends ParkingBoy{
    public int getLotAvailableParkingCountByNum(int i) {
        if(i == 1)
            return getFirstParkingLot().getAvailableParkingCount();
        else if(i == 2)
            return getSecondParkingLot().getAvailableParkingCount();
        return 0;
    }

    @Override
    public Ticket park(Car car) {
        if (getFirstParkingLot().getAvailableParkingCount() >= getSecondParkingLot().getAvailableParkingCount())
            return getFirstParkingLot().getTicketByCar(car);
        else
            return getSecondParkingLot().getTicketByCar(car);
    }
}
