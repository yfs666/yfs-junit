package com.yfs.junut.unit2;

import junit.framework.TestCase;

public class TestLargest extends TestCase {
//    public TestLargest(String name) {
//        super(name);
//    }

    public void testSimple() {
        assertEquals(9, Largest.largest1(new int[]{7,8,9,}));
    }

    public void testSimple2() {
        assertEquals(2147483647, Largest.largest1(new int[]{7,8,9,}));
    }
}
