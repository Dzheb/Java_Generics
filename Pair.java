package org.example.dzplus;

//4. Напишите обобщенный класс Pair,
// который представляет собой пару значений разного типа.
//        Класс должен иметь методы getFirst(), getSecond()
//        для получения значений
//        пары, а также переопределение метода toString(),
//        возвращающее строковое представление пары.
public class Pair<T,E> {
    private T first;
    private E second;

    public Pair(T first, E second) {
        this.first = first;
        this.second = second;
    }

    public T getFirst() {
        return first;
    }

    public void setFirst(T first) {
        this.first = first;
    }

    public E getSecond() {
        return second;
    }

    public void setSecond(E second) {
        this.second = second;
    }

    @Override
    public String toString() {
        return "Pair{" +
                "first=" + first +
                ", second=" + second +
                '}';
    }
}
