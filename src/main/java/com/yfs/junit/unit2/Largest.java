package com.yfs.junut.unit2;

/**
 * @author Yangfengshuai
 * @描述 取数组最大值的demo
 * @date 2018-11-12
 */
public class Largest{

    /**
     * @param list 参数数组
     * @return 最大值
     * @描述 取list的最大值
     * @author Yangfengshuai
     * @date 2018-11-12
     */
    public static int largest1(int[] list) {
        int index, max = Integer.MAX_VALUE;
        for (index = 0; index < list.length - 1; index++) {
            if (list[index] > max) {
                max = list[index];
            }
        }
        return max;
    }

    /**
     * @param list 参数数组
     * @return 最大值
     * @描述 取list的最大值
     * @author Yangfengshuai
     * @date 2018-11-12
     */
    public static int largest2(int[] list) {
        int index, max = Integer.MIN_VALUE;
        for (index = 0; index < list.length - 1; index++) {
            if (list[index] > max) {
                max = list[index];
            }
        }
        return max;
    }


    /**
     * @param list 参数数组
     * @return 最大值
     * @描述 取list的最大值
     * @author Yangfengshuai
     * @date 2018-11-12
     */
    public static int largest3(int[] list) {
        int index, max = Integer.MIN_VALUE;
        for (index = 0; index < list.length; index++) {
            if (list[index] > max) {
                max = list[index];
            }
        }
        return max;
    }

    /**
     * @param list 参数数组
     * @return 最大值
     * @描述 取list的最大值
     * @author Yangfengshuai
     * @date 2018-11-12
     */
    public static int largest4(int[] list) {
        if (list.length == 0) {
            throw new RuntimeException("参数不能为空");
        }
        int index, max = Integer.MIN_VALUE;
        for (index = 0; index < list.length; index++) {
            if (list[index] > max) {
                max = list[index];
            }
        }
        return max;
    }

}
