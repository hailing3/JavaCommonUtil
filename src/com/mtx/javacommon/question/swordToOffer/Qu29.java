package com.mtx.javacommon.question.swordToOffer;

import java.util.HashMap;

/**
 * 剑指offer：29题 数组中出现次数超过一半的数字
 * Created by lishaoming on 17-12-22.
 */
public class Qu29 {
    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 3, 2, 2, 3, 3, 6, 3, 7, 3, 3, 3, 3, 3, 3, 3, 4, 2, 3, 4, 3, 7, 3, 6, 4, 7, 4};
        long time = System.currentTimeMillis();
//        int result = find(array);
        int result = find2(array);
        System.out.println("耗时：" + (System.currentTimeMillis() - time) + "ms");
        System.out.println(result);
    }

    /**
     * 自创
     *
     * @param array
     * @return
     */
    private static int find(int[] array) {
        if (array == null) return -1;
        int length = array.length;
        if (length <= 0) return -1;
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        // key: 数字; value:次数
        for (int i = 0; i < length; i++) {
            int num = array[i];
            Object object = map.get(num);
            int count;
            if (object == null) {
                count = 0;
            } else {
                count = (Integer) object;
            }
            count++;
            if (count * 2 >= length) {

//                System.out.println("length = " + length);
//                print(map);

                return num;
            }
            map.put(num, count);
        }

//        System.out.println("length = " + length);
//        print(map);

        return -1;
    }

    private static void print(HashMap<Integer, Integer> map) {
        if (map == null) return;
        for (Integer key : map.keySet()) {
            System.out.println("key:" + key + ",出现次数：" + map.get(key));
        }
    }

    /**
     * 书中答案2
     * 由于该数字次数超过一半，所以出现该数字时+1，不同数字时-1；在计数器为0时，保存下一个数字，并计数为1
     * 目标数字次数超过所有其他数字之和，所以目标数字一定是最后一次把计数器定为1的数字
     *
     * @param array
     * @return
     */
    private static int find2(int[] array) {
        if (array == null) return -1;
        int result = array[0];
        int count = 1; // 从第1个开始
        int length = array.length;
        for (int i = 1; i < length; i++) {
            if (count == 0) {
                result = array[i];
                count = 1;
            } else if (result == array[i]) {
                count++;
            } else {
                count--;
            }
        }
        if (!checkMoreThanHalf(array, length, result))
            return -1;
        return result;
    }

    // 判断是否超过半数，避免所有数字都没有超过一半
    private static boolean checkMoreThanHalf(int[] array, int length, int result) {
        int times = 0;
        for (int i = 0; i < length; i++) {
            if (array[i] == result) {
                times++;
            }
        }
        if (times * 2 >= length) {
            return true;
        }
        return false;
    }

}
