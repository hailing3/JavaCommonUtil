package com.mtx.javacommon;

import com.mtx.javacommon.util.ThumbnailGeneratorUtil;

public class Test {

    static final String FILE_ORIGIN = "file/origin.png";
    static final String FILE_END = "file/end.png";
    static final int THUM_HEIGHT = 300;

    public static void main(String[] args) {
        try {
            ThumbnailGeneratorUtil.transform(FILE_ORIGIN, FILE_END, THUM_HEIGHT, THUM_HEIGHT);
        } catch (Exception e) {
            e.printStackTrace();
        }


        System.out.println("1111Hello, World!");
        System.out.println(show());

    }

    public static String show() {
        return "Hello Wolrd!";
    }

}
