package com.thoughtworks.tdd.story_test;

import com.thoughtworks.tdd.story1.Car;
import com.thoughtworks.tdd.story1.ParkingBoy;
import com.thoughtworks.tdd.story1.Ticket;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

/**
 * Created by 桐爷哥 on 2019/7/13.
 */
public class Story1Test {
    // ADC1
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

    // AC2
    @Test
    public void should_return_multiple_ticket_when_call_park_given_cars(){
        ParkingBoy parkingBoy = new ParkingBoy();
        Car car1 = new Car();
        Car car2 = new Car();

        Ticket t1 = parkingBoy.park(car1);
        Ticket t2 = parkingBoy.park(car2);

        assertNotNull(t1);
        assertNotNull(t2);
    }

    @Test
    public void should_return_right_car_when_call_fetch_given_tickets(){
        ParkingBoy parkingBoy = new ParkingBoy();

        Car car1 = new Car();
        Car car2 = new Car();

        Ticket t1 = parkingBoy.park(car1);
        Ticket t2 = parkingBoy.park(car2);

        Car t1_return_car = parkingBoy.fetch(t1);
        Car t2_return_car = parkingBoy.fetch(t2);

        assertEquals(car1,t1_return_car);
        assertEquals(car2,t2_return_car);

    }

    
}
