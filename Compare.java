package org.example.dzplus;

public class Compare {
    public static void main(String[] args) {
//        String[] arr1 = new String[]{"Winter", "Spring", "Summer", "Autumn"};
//        Integer[] arr2 = new Integer[]{1, 2, 3, 4};
        String[] arr3 = new String[]{"Winter", "Spring", "Summer", "Autumn"};
        Integer[] arr4 = new Integer[]{1, 2, 3, 4, 5};
        System.out.println( new CompareArrays<>(arr3, arr4));
        System.out.println(new CompareArrays<>(arr3, arr4).compare());
//        System.out.println( new CompareArrays<>(arr1, arr2));
//        System.out.println(new CompareArrays<>(arr1, arr2).compare());
    }
}
