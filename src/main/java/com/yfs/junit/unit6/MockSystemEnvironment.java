package com.yfs.junit.unit6;

public class MockSystemEnvironment implements Environment1{

    private long currentTimeMills;

    public long getTime() {
        return currentTimeMills;
    }

    public void setTime(long time) {
        currentTimeMills = time;
    }
}
