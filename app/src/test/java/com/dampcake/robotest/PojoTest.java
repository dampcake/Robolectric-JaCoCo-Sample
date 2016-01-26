package com.dampcake.robotest;

import org.junit.Test;

import static org.junit.Assert.*;

public class PojoTest {

    @Test
    public void testPojo() {
        Pojo p = new Pojo();

        p.setThing("String1");

        assertEquals("String1", p.getThing());
    }
}