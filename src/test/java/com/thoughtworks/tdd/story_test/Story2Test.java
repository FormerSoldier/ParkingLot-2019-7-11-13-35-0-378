package com.thoughtworks.tdd.story_test;

import com.thoughtworks.tdd.story2.Car;
import com.thoughtworks.tdd.story2.ParkingBoy;
import com.thoughtworks.tdd.story2.Ticket;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class Story2Test {
    // AC1
    @Test
    public void should_return_Unrecognized_parking_ticket_when_call_fetch_and_query_given_wrong_ticket_to_fetch(){
        ParkingBoy parkingBoy = new ParkingBoy();
        Ticket ticket = new Ticket();
        parkingBoy.fetch(ticket);
        String message = parkingBoy.query();
        assertEquals(message, "Unrecognized parking ticket.");
    }

    @Test
    public void should_return_Unrecognized_parking_ticket_when_call_fetch_and_query_given_used_ticket_to_fetch(){
        ParkingBoy parkingBoy = new ParkingBoy();
        Ticket ticket = parkingBoy.park(new Car());

        parkingBoy.fetch(ticket);
        String first_message = parkingBoy.query();

        parkingBoy.fetch(ticket);
        String second_message = parkingBoy.query();

        assertNotEquals(first_message, "Unrecognized parking ticket.");
        assertEquals(second_message, "Unrecognized parking ticket.");
    }
    // AC 2
    @Test
    public void should_return_Please_provide_your_parking_ticket_when_call_fetch_and_query_given_null_to_fetch(){
        ParkingBoy parkingBoy = new ParkingBoy();

        parkingBoy.fetch(null);
        String msg = parkingBoy.query();
        assertEquals(msg,"Please provide your parking ticket");
    }
}
