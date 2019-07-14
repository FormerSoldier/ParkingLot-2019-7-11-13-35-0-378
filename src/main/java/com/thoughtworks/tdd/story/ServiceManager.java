package com.thoughtworks.tdd.story;

import java.util.ArrayList;
import java.util.List;

public class ServiceManager {
    private List<ParkingBoy> parkingBoysList = new ArrayList<>();
    public List<ParkingBoy> getParkingBoysList() {
        return parkingBoysList;
    }

    public void addParkingBoyToList(ParkingBoy parkingBoy) {
        parkingBoysList.add(parkingBoy);

    }
}
