package org.example.dzplus;

//2. Написать класс Калькулятор (необобщенный), который содержит обобщенные статические методы: sum(),
//        multiply(), divide(), subtract(). Параметры этих методов – два
//        числа разного типа, над которыми должна быть произведена операция.
public class Calculator {
    public static void main(String[] args) {
        double result;
        result = add(5.7, 7.8);
        System.out.println(String.format("Результат сложения: %1$,.4f !", result));
        result = subtract(5, 7.8);
        System.out.println(String.format("Результат вычитания: %1$,.4f !", result));
        result = mult(5.7, 7);
        System.out.println(String.format("Результат умножения: %1$,.4f !", result));
        result = div(7, 7.8);
        System.out.println(String.format("Результат деления: %1$,.4f !", result));
    }

    public static <T extends Number> double add(T a, T b) {
        return a.doubleValue() + b.doubleValue();
    }


    public static <T extends Number> double subtract(T a, T b) {
        return a.doubleValue() - b.doubleValue();
    }


    public static <T extends Number> double mult(T a, T b) {
        return a.doubleValue() * b.doubleValue();
    }


    public static <T extends Number> double div(T a, T b) {
        return a.doubleValue() / b.doubleValue();
    }

}

