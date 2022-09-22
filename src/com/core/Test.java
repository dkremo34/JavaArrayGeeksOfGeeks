package com.core;

import java.util.*;

public class Test {
    public static void main(String[] args) {


        Integer[] arr = {7, 10, 4, 3 ,20, 15}; // 4,7,10,15,20

        /*Map<Integer, Integer> m = new HashMap<>();
        for (int i : arr) {
            if (m.containsKey(i)) {
                m.put(i, m.get(i) + 1);
            } else {
                m.put(i, 1);
            }
        }
        ArrayList<Integer> l = new ArrayList<>();
        for (Map.Entry<Integer, Integer> k : m.entrySet()) {
            if (k.getValue() > 1) {
                l.add(k.getKey());
            }
        }
        Collections.sort(l);
        System.out.println(l);*/

        Arrays.sort(arr);
        System.out.println(arr[0]);
        int integer = arr[0];
        int k = arr[integer-1];
        System.out.println(k);






    }
}
