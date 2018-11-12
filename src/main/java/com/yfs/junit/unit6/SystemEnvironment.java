package com.yfs.junit.unit6;

public class SystemEnvironment implements Environment1 {
    public long getTime() {
        return System.currentTimeMillis();
    }
}
