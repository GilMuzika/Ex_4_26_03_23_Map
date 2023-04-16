package org.example;

import java.util.Random;

public class CreateArray {
    private static Random _rnd = new Random();

    static public int[] createRandomArray(int size) {
        int[] array = new int[size];
        for(int i = 0; i < array.length; i++) {
            array[i] = _rnd.nextInt(100);
        }
        return array;
    }
}