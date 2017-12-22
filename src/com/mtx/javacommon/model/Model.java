package com.mtx.javacommon.model;

/**
 * Created by lishaoming on 17-9-12.
 */
public class Model implements Comparable<Model> {
    public String name;
    public int id;

    public Model(int id, String name) {
        this.name = name;
        this.id = id;
    }

    @Override
    public String toString() {
        return "id=" + id + ",name=" + name;
    }

    @Override
    public int compareTo(Model model) {
        return this.id - model.id;
    }

    @Override
    public boolean equals(Object obj) {
        return id == ((Model) obj).id;
    }
}
