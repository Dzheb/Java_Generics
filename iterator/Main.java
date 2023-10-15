package org.example.dzplus.iterator;


public class Main {
    public static void main(String[] args) {
//        теперь вместо метода info() используется итератор массива
//        для вывода на печать
        System.out.println("--------------- Integer -----------");
        GenericArray<Integer> arrayInteger = new GenericArray<>();
        System.out.println("--------------- before-----------");
        arrayInteger.info();
        arrayInteger.add(27647);
        arrayInteger.add(700);
        arrayInteger.add(32000);
        System.out.println("--------------- after add-----------");
        arrayInteger.info();
        arrayInteger.remove(32000);
        System.out.println("--------------- after remove-----------");
        arrayInteger.info();
        System.out.println("--------------- String -----------");
        GenericArray<String> stringInteger = new GenericArray<>();
        System.out.println("--------------- before-----------");
        stringInteger.info();
        stringInteger.add("one");
        stringInteger.add("two");
        stringInteger.add("three");
        System.out.println("--------------- after add-----------");
        stringInteger.info();
        stringInteger.remove("two");
        System.out.println("--------------- after remove-----------");
        stringInteger.info();

    }
}