package com.mtx.javacommon.test;

import com.mtx.javacommon.model.Model;

import java.util.ArrayList;
import java.util.TreeSet;

/**
 * Created by lishaoming on 17-9-12.
 */
public class TestList {
    public static void main(String[] args) {
//        TreeSet<Model> set = new TreeSet<Model>();
//        set.add(new Model(2, "ccc"));
//        set.add(new Model(0, "eee"));
//        set.add(new Model(0, "aaa"));
//        set.add(new Model(1, "bbb"));
//        set.add(new Model(3, "ddd"));
//        print(set);


        ArrayList<Model> list = new ArrayList<Model>();
        list.add(new Model(2, "ccc"));
        list.add(new Model(0, "eee"));
//        list.add(new Model(0, "aaa"));
        list.add(new Model(1, "bbb"));
        list.add(new Model(3, "ddd"));
        print(list);

        Model model = new Model(0, "aaa");
        System.out.println(list.contains(model));
    }

    public static void print(TreeSet<Model> list) {
        for (Model s : list) {
            System.out.println(s);
        }
    }


    public static void print(ArrayList<Model> list) {
        for (Model s : list) {
            System.out.println(s);
        }
    }
}
