package ru.javabegin.oop05Extend;

public class Main {
    public static void main(String[] args) {
        Car car = new Car(); // можно вызывать все функции родителя
        car.setName("GGOoooo");
        car.drive();
        car.signal();
        car.setNumber(235);
        System.out.println(car.getNumber());

    }
}
