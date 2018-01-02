package com.mtx.javacommon.question.swordToOffer;

/**
 * 剑指offer第三题
 * 输入二维数组，从左到右，从上到下递增，判断数组中是否含有某个数
 * Created by lishaoming on 18-1-2.
 */
public class Qu03 {
    public static void main(String[] args) {
        int[][] nums = new int[][]{{1, 2, 8, 9}, {2, 4, 9, 12}, {4, 7, 10, 13}, {6, 8, 11, 15}};

        print(nums);
        System.out.println("-----------------------");
        System.out.println("5," + contains(nums, 5));
        System.out.println("-----------------------");
        System.out.println("7," + contains(nums, 7));
        System.out.println("-----------------------");
        System.out.println("6," + contains(nums, 6));
        System.out.println("-----------------------");
        System.out.println("0," + contains(nums, 0));
        System.out.println("-----------------------");
        System.out.println("16," + contains(nums, 16));
    }

    /**
     * 二维数组i为横坐标，表示第几列；j为纵坐标，表示第几行
     * nums[j][i] 从右上角向左下角移动
     *
     * @param nums
     * @param N
     * @return
     */
    private static boolean contains(int[][] nums, int N) {
        int i = nums.length - 1;
        int j = 0;
        while (i >= 0 && j < nums.length) {
            int num = nums[j][i];
            if (N > num) {
                System.out.println(num + ",to down");
                j++;
                continue;
            } else if (N < num) {
                System.out.println(num + ",to left");
                i--;
                continue;
            } else {
                return true;
            }
        }
        return false;
    }

    private static void print(int[][] nums) {
        for (int num[] : nums) {
            for (int n : num) {
                System.out.print(n + "\t");
            }
            System.out.println();
        }
    }
}
