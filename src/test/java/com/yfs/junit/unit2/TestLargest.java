package com.yfs.junut.unit2;

import junit.framework.TestCase;

public class TestLargest extends TestCase {
    public TestLargest(String name) {
        super(name);
    }

    public void testSimple() {
        assertEquals(9, Largest.largest1(new int[]{7,8,9,}));
    }

    public void testSimple2() {
        assertEquals(2147483647, Largest.largest1(new int[]{7,8,9}));
    }

    public void testSimple3() {
        assertEquals(9, Largest.largest2(new int[]{8,9,6}));
        assertEquals(9, Largest.largest2(new int[]{9,9,6}));
        assertEquals(9, Largest.largest2(new int[]{9,8,6}));
        assertEquals(9, Largest.largest2(new int[]{7,8,9}));
    }

    public void testSimple4() {
        assertEquals(9, Largest.largest3(new int[]{8,9,6}));
        assertEquals(9, Largest.largest3(new int[]{9,9,6}));
        assertEquals(9, Largest.largest3(new int[]{9,8,6}));
        assertEquals(9, Largest.largest3(new int[]{7,8,9}));
        assertEquals(9, Largest.largest3(new int[]{9}));
    }

    public void testSimple5() {
        assertEquals(9, Largest.largest3(new int[]{-8,9,-6}));
        assertEquals(9, Largest.largest3(new int[]{-9,9,-6}));
        assertEquals(9, Largest.largest3(new int[]{9,8,-6}));
        assertEquals(9, Largest.largest3(new int[]{7,-8,9}));
        assertEquals(9, Largest.largest3(new int[]{9}));
    }

    public void testSimple6() {
        try {
            assertEquals(9, Largest.largest4(new int[]{}));
            fail("应该抛异常的！");
        } catch (RuntimeException e) {
            assertTrue(true);
        }
    }

}
