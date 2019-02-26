package com.mtx.javacommon;

/**
 * Created by lishaoming on 18/2/23.
 */
public class Test02 {
    public static void main(String[] args) {
        String name = "Hello World, I am Tom 今天天气很好" + "123" + "abc";
        System.out.println(name);

//        double N = 11.0;
////        System.out.println(N++);
////        System.out.println(N);
//
//        int M = 2;
////        System.out.println(++M);
////        System.out.println(M);
//
//        double P = N / M;
//        System.out.println(P);
//
//
//        boolean flag = false;
//        System.out.println(flag);
//
//        flag = true;

//        if (N < 3) {
//            System.out.println("This is right");
//        } else {
//            System.out.println("This is not right");
//        }
//
//        for (int i = 0; i < 5; i++) {
//            System.out.println("This is line " + i);
//        }

//        System.out.println((1/0 == 2) );

        boolean a = false;
        boolean b = true;
        System.out.println(a && (1 / 0 == 2));
        System.out.println(a || b);
        System.out.println(!a);


    }
}
