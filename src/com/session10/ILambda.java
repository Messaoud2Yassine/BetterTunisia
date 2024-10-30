package com.session10;

@FunctionalInterface
public interface ILambda<T> {
    boolean test(T a, T b);

}
