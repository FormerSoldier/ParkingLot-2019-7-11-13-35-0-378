package com.thoughtworks.tdd.story_test;

import com.thoughtworks.tdd.story.Car;
import com.thoughtworks.tdd.story.ParkingBoy;
import com.thoughtworks.tdd.story.ServiceManager;
import com.thoughtworks.tdd.story.Ticket;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;


public class Story6Test {
    // AC 1
    @Test
    public void should_return_ticket_when_call_park_given_car(){
        ServiceManager serviceManager = new ServiceManager();
        ParkingBoy pb1 = new ParkingBoy();
        ParkingBoy pb2 = new ParkingBoy();
        ParkingBoy pb3 = new ParkingBoy();

        serviceManager.addParkingBoyToList(pb1);
        serviceManager.addParkingBoyToList(pb2);
        serviceManager.addParkingBoyToList(pb3);

        List<ParkingBoy> parkingBoysList = serviceManager.getParkingBoysList();
        for(int i = 0; i < parkingBoysList.size(); i++){
            Car car = new Car();
            Ticket ticket = parkingBoysList.get(i).park(car);
            Assertions.assertNotNull(ticket);
            Assertions.assertNotNull(parkingBoysList.get(i).fetch(ticket));
        }
        Assertions.assertNotEquals(parkingBoysList.size(),0);
    }

    //AC 2
    @Test
    public void should_return_ticket_when_call_manager_park_given_car(){
        ServiceManager serviceManager = new ServiceManager();
        Car car = new Car();
        Ticket ticket = serviceManager.park(car);

        Assertions.assertNotNull(ticket);
    }

    @Test
    public void should_return_car_when_call_manager_fetch_given_ticket(){
        ServiceManager serviceManager = new ServiceManager();
        Ticket ticket = serviceManager.park(new Car());

        Car car = serviceManager.fetch(ticket);
        Assertions.assertNotNull(car);
    }
}
