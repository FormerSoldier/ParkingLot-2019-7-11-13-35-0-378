package com.thoughtworks.tdd.story_test;

import com.thoughtworks.tdd.story.Car;
import com.thoughtworks.tdd.story.SmartParkingBoy;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Story4Test {

    @Test
    public void should_return_9_9_when_call_getLotAvailableParkingCountByNum_twice_given_two_car(){
        SmartParkingBoy smartParkingBoy = new SmartParkingBoy();
        smartParkingBoy.park(new Car());
        smartParkingBoy.park(new Car());

        Assertions.assertEquals(smartParkingBoy.getLotAvailableParkingCountByNum(1),9);
        Assertions.assertEquals(smartParkingBoy.getLotAvailableParkingCountByNum(2),9);

    }
}
