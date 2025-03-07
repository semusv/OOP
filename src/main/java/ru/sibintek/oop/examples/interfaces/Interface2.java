package main.java.ru.sibintek.oop.examples.interfaces;

/**
 * Реализация статического метода интерфейсом
 */
interface Callback1 {
    static void call(int person) {
        System.out.println("Call p:" + person);
    }
}

class Interface2 implements Callback1 {
    public static void main(String[] args) {
        Callback1.call(3);
    }
}