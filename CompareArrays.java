package org.example.dzplus;

import java.util.Arrays;

public class CompareArrays<T, E> {
    private final T[] array1;
    private final E[] array2;

    public CompareArrays(T[] array1, E[] array2) {
        this.array1 = array1;
        this.array2 = array2;
    }

// метод сравнения массивов
    public boolean compare() {
        return this.array1.length == this.array2.length;
    }

    @Override
    public String toString() {
        return "compareArrays{" +
                "array1=" + Arrays.toString(array1) +
                ", array2=" + Arrays.toString(array2) +
                '}';
    }
}
