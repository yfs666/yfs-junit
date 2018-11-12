package com.yfs.junit.unit6;

import java.util.Calendar;

public class Checker {
    private Environment1 env;

    public Checker(Environment1 env) {
        this.env = env;
    }

    public void reminder() {
        Calendar cal = Calendar.getInstance();
        cal.setTimeInMillis(env.getTime());
        int hour = cal.get(Calendar.HOUR_OF_DAY);
        System.out.println(hour);
        if (hour >= 17) {
            System.out.println(" >= 17 ");
        }
    }

}
