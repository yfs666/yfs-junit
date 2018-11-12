package com.yfs.junit.unit2;

import junit.extensions.TestSetup;
import junit.framework.*;

/**
 * @描述 通过test suite测试
 * @author Yangfengshuai
 * @date 2018/11/12
 */
public class TestSuiteDemo extends TestCase{
    public TestSuiteDemo(String name) {
        super(name);
    }

    @Override
    protected void setUp() throws Exception {
        System.out.println("setUp................");
    }

    @Override
    protected void tearDown() throws Exception {
        System.out.println("tearDown................");
    }

    public void testSimple2() {
        System.out.println("testSimple2");
        assertEquals(2147483647, Largest.largest1(new int[]{7,8,9}));
    }



    public void testSimple4() {
        System.out.println("testSimple4");
        assertEquals(9, Largest.largest3(new int[]{8,9,6}));
        assertEquals(9, Largest.largest3(new int[]{9,9,6}));
        assertEquals(9, Largest.largest3(new int[]{9,8,6}));
        assertEquals(9, Largest.largest3(new int[]{7,8,9}));
        assertEquals(9, Largest.largest3(new int[]{9}));
    }

    public void testSimple5() {
        System.out.println("testSimple5");
        assertEquals(9, Largest.largest3(new int[]{-8,9,-6}));
        assertEquals(9, Largest.largest3(new int[]{-9,9,-6}));
        assertEquals(9, Largest.largest3(new int[]{9,8,-6}));
        assertEquals(9, Largest.largest3(new int[]{7,-8,9}));
        assertEquals(9, Largest.largest3(new int[]{9}));
    }

    public void testSimple6() {
        try {
            System.out.println("testSimple6");
            assertEquals(9, Largest.largest4(new int[]{}));
            fail("应该抛异常的！");
        } catch (RuntimeException e) {
            assertTrue(true);
        }
    }

    public static Test suite() {
        TestSuite testSuite = new TestSuite();
        testSuite.addTest(new TestSuiteDemo("testSimple2"));
        testSuite.addTest(new TestSuiteDemo("testSimple6"));
        testSuite.addTestSuite(TestSuiteDemo.class);
        TestSetup testSetup = new TestSetup(testSuite){
            @Override
            protected void setUp() throws Exception {
                oneTimeSetUp();
            }

            @Override
            protected void tearDown() throws Exception {
                oneTimeTearDown();
            }
        };
        return testSetup;
    }

    public static void oneTimeSetUp() {
        System.out.println("oneTimeSetUp");
    }

    public static void oneTimeTearDown() {
        System.out.println("oneTimeTearDown");
    }



}
