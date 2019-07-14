package com.thoughtworks.tdd.story_test;

import com.thoughtworks.tdd.story1.Car;
import com.thoughtworks.tdd.story1.ParkingBoy;
import com.thoughtworks.tdd.story1.Ticket;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

/**
 * Created by 桐爷哥 on 2019/7/13.
 */
public class Story1Test {

    @Test
    public void should_return_ticket_when_call_park_given_car(){
        ParkingBoy parkingBoy = new ParkingBoy();
        Car car = new Car();
        Ticket ticket = parkingBoy.park(car);

        assertNotNull(ticket);
    }

    @Test
    public void should_return_car_when_call_fetch_given_ticket(){
        ParkingBoy parkingBoy = new ParkingBoy();
        Ticket ticket = new Ticket();
        Car car = parkingBoy.fetch(ticket);

        assertNotNull(car);
    }
}
