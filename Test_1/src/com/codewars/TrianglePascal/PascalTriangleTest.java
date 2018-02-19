package com.codewars.TrianglePascal;

import org.junit.Test;

import static org.junit.Assert.*;

public class PascalTriangleTest {


    @Test
    public void canCreateTriangleWhithDepth0 () {
        PascalTriangle triangle = new PascalTriangle(0);
        assertNotNull(triangle);
    }

    @Test
    public void canCreateTriangleWhithDepth1 () {
        PascalTriangle triangle = new PascalTriangle(1);
        assertNotNull(triangle);
    }

    @Test
    public void canCreateTriangleWhithDepth3 () {
        PascalTriangle triangle = new PascalTriangle(3);
        assertNotNull(triangle);
    }
}
