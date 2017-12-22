package com.mtx.javacommon.question;

/**
 * 面试题：所有奇数放到所有偶数前
 * Created by lishaoming on 17-12-14.
 */
public class TestArray {
    public static void main(String[] args) {
        int[] nums = new int[]{21, 1, 15, 16, 2, 3, 4, 12, 13, 17, 14, 5, 6, 7, 18, 8, 9, 10, 19, 20, 11};
        int[] endNums = method(nums);
        if (endNums != null) {
            for (int i = 0; i < endNums.length; i++) {
                System.out.println(endNums[i]);
            }
        }
    }

    private static int[] method(int[] nums) {
        if (nums == null) return null;
        int start = 0;
        int end = nums.length - 1;
        while (start < end) {
            // 奇数，直至找到偶数
            while (start < end && !isSuit(nums[start])) {
                start++;
            }
            // 偶数，直至找到奇数
            while (start < end && isSuit(nums[end])) {
                end--;
            }

            // 一奇一偶，交换
            if (start < end) {
                int temp = nums[start];
                nums[start] = nums[end];
                nums[end] = temp;
            }

        }
        return nums;
    }

    // 条件判断语句：判断奇偶，或者扩展判断其他条件
    private static boolean isSuit(int num) {
        return num % 2 == 0;
    }
}
