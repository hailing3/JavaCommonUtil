package com.mtx.javacommon.test;

/**
 * 剑指offer面试题9：斐波那契数列
 * Created by lishaoming on 17/12/13.
 */
public class TestFibonacci {
    public static void main(String[] args) {
        long time = System.currentTimeMillis();
        System.out.println("开始:" + time);
        int N = 7;
//        System.out.println(method1(N));
        System.out.println(method2(N));
        long timeEnd = System.currentTimeMillis();
        System.out.println("结束：" + timeEnd + ", 耗时：" + (timeEnd - time) + "ms");
    }

    // 重复节点过多，复杂度称指数上升
    private static int method1(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        return method1(n - 1) + method1(n - 2);
    }

    private static int method2(int n) {
        int[] nums = new int[]{0, 1};
        if (n < 2) {
            return nums[n];
        }
        int num2 = nums[0];
        int num1 = nums[1];
        int num = 0;
        for (int i = 2; i <= n; i++) {
            num = num1 + num2;
            num2 = num1;
            num1 = num;
        }
        return num;
    }
}
