package com.softserve.edu09;

public class TwoGenerate<T, V> {
    private T objectT;
    private V objectV;

    public TwoGenerate(T objectT, V objectV) {
        this.objectT = objectT;
        this.objectV = objectV;
    }

    public void printTypes() {
        System.out.println("Type T: " + objectT.getClass().getName());
        System.out.println("Type V: " + objectV.getClass().getName());
    }

    public T getObT() {
        return objectT;
    }

    public V getObV() {
        return objectV;
    }
}
