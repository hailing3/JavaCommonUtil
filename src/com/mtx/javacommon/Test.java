package com.mtx.javacommon;

import java.io.IOException;

public class Test {

    public static void main(String[] args) throws IOException {
        String s = "\"abcdefg\"";
        s = s.substring(1, s.length() - 1);
        System.out.println(s);

    }

    private static int getLayoutNum(int functionNum, int functionPerLayout) {
        int left = functionNum % functionPerLayout;
        return functionNum / functionPerLayout + (left == 0 ? 0 : 1);
    }

}
