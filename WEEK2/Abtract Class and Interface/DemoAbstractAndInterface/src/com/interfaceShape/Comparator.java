package com.interfaceShape;

public interface Comparator<Circle> extends java.util.Comparator<T> {
    int compare(Circle circle1,Circle circle2);

    @Override
    int compare(T o1, T o2);
}
