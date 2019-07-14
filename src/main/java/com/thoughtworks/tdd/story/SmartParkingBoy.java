package com.thoughtworks.tdd.story;

public class SmartParkingBoy extends ParkingBoy{
    public int getLotAvailableParkingCountByNum(int i) {
        if(i == 1)
            return firstParkingLot.getAvailableParkingCount();
        else if(i == 2)
            return secondParkingLot.getAvailableParkingCount();
        return 0;
    }

    @Override
    public Ticket park(Car car) {
        if (firstParkingLot.getAvailableParkingCount() >= secondParkingLot.getAvailableParkingCount())
            return firstParkingLot.getTicketByCar(car);
        else
            return secondParkingLot.getTicketByCar(car);
    }
}
