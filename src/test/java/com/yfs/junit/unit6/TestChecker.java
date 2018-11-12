package com.yfs.junit.unit6;

import junit.framework.TestCase;

import java.util.Calendar;

public class TestChecker extends TestCase{

    public TestChecker(String name) {
        super(name);
    }

    public void testQuittingTime() {
        MockSystemEnvironment env = new MockSystemEnvironment();
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.YEAR, 2018);
        cal.set(Calendar.MONTH, 10);
        cal.set(Calendar.DAY_OF_MONTH, 1);
        cal.set(Calendar.HOUR_OF_DAY, 15);
        cal.set(Calendar.MINUTE, 55);
        long t1 = cal.getTimeInMillis();
        env.setTime(t1);
        Checker checker = new Checker(env);
        checker.reminder();
        t1 = t1 + 5 * 60 * 1000;
        env.setTime(t1);
        checker.reminder();
        t1 = t1 + 2 * 60 * 60 * 1000;
        env.setTime(t1);
        checker.reminder();

    }
}
