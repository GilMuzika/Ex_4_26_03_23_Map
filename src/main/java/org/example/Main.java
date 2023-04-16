package org.example;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Random;

// https://docs.google.com/document/d/17gCUybj3ZSgC0sWCAu9gYdzlhfMZeMaXt9R__N9-nkw/edit

public class Main {


    private static int[] getIndices(int[] array, int target) {
        HashMap<Integer, int[]> map = new HashMap<>();
        for(int i = 0; i < array.length; i++) {
            for(int j = 0; j < array.length; j++) {
                if(array[i] + array[j] == target && i != j) {
                    map.put(target, new int[]{i, j});
                }
            }
        }
        return map.get(target);
    }

    public static void main(String[] args) {
        Random rnd = new Random();
        int[] array = CreateArray.createRandomArray(rnd.nextInt(100, 1000));
        int target = rnd.nextInt(10, 200);
        int[] indices = getIndices(array, target);

        System.out.println("The array is:");
        System.out.println(Arrays.toString(array));

        if(indices == null)
            System.out.format("The array contains no numbers that make the target %s by adding up", target);
        else
            System.out.format("%s + %s = %s, the index of %s is %s, the index of %s is %s",
                    array[indices[0]], array[indices[1]], target, array[indices[0]], indices[0], array[indices[1]], indices[1]
            );


    }
}
