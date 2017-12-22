package com.mtx.javacommon.question.swordToOffer;

import com.mtx.javacommon.model.MinHeap;

/**
 * 剑指offer 30题：输入n个整数，找到其中最大的k个数
 * http://blog.csdn.net/xiao__gui/article/details/8687982
 * Created by lishaoming on 17-12-22.
 */
public class Qu30 {
    public static void main(String[] args) {
        int[] data = new int[]{4, 5, 1, 6, 2, 7, 3, 8};

        int[] top4 = topK(data, 4);
        // 最小的应该是1,2,3,4
        for (int i = 0; i < 4; i++) {
            System.out.println(top4[i]);
        }
    }

    // 从data数组中获取最大的k个数
    private static int[] topK(int[] data, int k) {
        // 先取K个元素放入一个数组topk中
        int[] topk = new int[k];
        for (int i = 0; i < k; i++) {
            topk[i] = data[i];
        }

        // 转换成最小堆
        MinHeap heap = new MinHeap(topk);

        // 从k开始，遍历data
        for (int i = k; i < data.length; i++) {
            int root = heap.getRoot();

            // 当数据大于堆中最小的数（根节点）时，替换堆中的根节点，再转换成堆
            if (data[i] > root) {
                heap.setRoot(data[i]);
            }
        }

        return topk;
    }
}
