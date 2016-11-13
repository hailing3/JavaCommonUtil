package com.mtx.javacommon.test;

/**
 * 经济计划
 * Created by lishaoming on 16/11/13.
 */
public class TestEconomic {

    static final double moneyPerYearIn = 40000;
    static final double RATE = 0.4;
    static int years = 50;
    static final int YEAR_NOW = 2016;
    static final int AGE_NOW = 24;
    static final double RATE_DOLLAR = 6.78;

    public static void main(String[] args) {
        System.out.println("经济计划：每年固定存储" + getFormat(moneyPerYearIn) + "，保证投资年利率=" + RATE);
        double total = 0;
        for (int i = 0; i < years; i++) {
            double increase = total * RATE;
            total = total + increase + moneyPerYearIn;
            System.out.println((YEAR_NOW + i) + "年末\t\t" + (AGE_NOW + i) + "岁\t\t" + "净收益=" + getFormat(increase)
                    + "\t\t固定增长=" + getFormat(moneyPerYearIn) + "\t\t总资产约=" + getFormat(total) + "\t\t合"
                    + getFormat(total / RATE_DOLLAR) + "美元");
        }
    }

    public static String getFormat(double num) {
        if (num < 10000) {
            return (int) num + "";
        }
        if (num < 10000 * 10000) {
            return (int) (num / 10000) + "万";
        }
        return (int) (num / 10000 / 10000) + "亿";
    }

}
