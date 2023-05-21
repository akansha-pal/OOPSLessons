package com.sparta.ap.safaripark;

import com.sparta.ap.safaripark.safaripark.Airplane;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class AirplaneTest {
    @Test
    @DisplayName("Checking the altitude and airline")
    public void testingGetMethods() {
        Airplane a = new Airplane(200,100,"JetsRUs");
        a.ascend(300);
        Assertions.assertEquals(300, a.getAltitude());
        Assertions.assertEquals("JetsRUs", a.getAirline());
    }
    @Test
    @DisplayName("Checking the descend method")
    public void testingDescend() {
        Airplane a = new Airplane(200,100,"JetsRUs");
        a.ascend(900);
        a.descend(400);
        Assertions.assertEquals(500, a.getAltitude());
    }
    @Test
    @DisplayName("Checking the override move times method")
    public void testingOverrideMoveTimes() {
        Airplane a = new Airplane(200,100,"JetsRUs");
        a.ascend(800);
        a.descend(400);
        Assertions.assertEquals("Moving along 4 times at an altitude of 400 meters", a.move(4));
    }

    @Test
    @DisplayName("Checking the override move method")
    public void testingOverrideMove() {
        Airplane a = new Airplane(200,100,"JetsRUs");
        a.ascend(300);
        a.descend(400);
        Assertions.assertEquals("Moving along at an altitude of 0 meters", a.move());
    }
}
