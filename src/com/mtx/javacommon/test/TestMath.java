package com.mtx.javacommon.test;

import java.util.Random;

/**
 * 测试数据概率问题
 */
public class TestMath {

    public static void main(String[] args) {
        double count = 0; // 次数
        double zeroCount = 0;
        double oneCount = 0;
        while (true) {
            int num = getRandom();
            if (num == 0) {
                zeroCount++;
            } else {
                oneCount++;
            }
            count++;
            double rate = zeroCount / oneCount;
            System.out.println("0:1概率为" + rate + ",0有" + zeroCount + "次；1有" + oneCount + "次，共" + count + "次");
        }
    }

    /**
     * 生成1或0的随机数
     *
     * @return
     */
    private static int getRandom() {
        int max = 2;
        int min = 0;
        Random random = new Random();
        int s = random.nextInt(max) % (max - min + 1) + min;
        return s;
    }

}
