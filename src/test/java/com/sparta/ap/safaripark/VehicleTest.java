package com.sparta.ap.safaripark;

import com.sparta.ap.safaripark.safaripark.Vehicle;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class VehicleTest {

    @Test
    @DisplayName("Testing speed returns the correct value")
    public  void testingGetSpeed(){
        Vehicle v = new Vehicle();
        Assertions.assertEquals(10,v.getSpeed());

    }
    @Test
    @DisplayName("Testing capacity returns the correct value")
    public  void testingGetCapacity() {
        Vehicle v = new Vehicle();
        Assertions.assertEquals(4, v.getCapacity());
    }
    @Test
    @DisplayName("Testing position returns the correct value")
    public  void testingMoveString() {
        Vehicle v = new Vehicle(4,2,3,10);
        Assertions.assertEquals("Moving along", v.move());
    }
    @Test
    @DisplayName("Testing position and speed returns the correct value")
    public  void testingGetMovePosition() {
        Vehicle v = new Vehicle(4,2,3,10);
        v.move();
        Assertions.assertEquals(13, v.getPosition());
    }

    @Test
    @DisplayName("Testing position times speed returns the correct value")
    public  void testingMoveTimesPosition() {
        Vehicle v = new Vehicle(4,2,3,10);
        v.move(5);
        Assertions.assertEquals(53, v.getPosition());
    }
    @Test
    @DisplayName("Testing position times speed returns the correct value")
    public  void testingMoveTimesString() {
        Vehicle v = new Vehicle(4,2,3,10);
        Assertions.assertEquals("Moving along 5 times", v.move(5));
    }

    @Test
    @DisplayName("Testing passengers less than capacity returns the correct value")
    public  void testingGetNumPassangersLessCapacity() {
        Vehicle v = new Vehicle(4,2,3,10);
        v.setNumPassangers(3);
        Assertions.assertEquals(3, v.getNumPassangers());
    }
    @Test
    @DisplayName("Testing passengers more than than capacity returns the initial value of passangers")
    public  void testingGetNumPassangersMoreCapacity() {
        Vehicle v = new Vehicle(4,2,3,10);
        v.setNumPassangers(5);
        Assertions.assertEquals(0, v.getNumPassangers());
    }
}
