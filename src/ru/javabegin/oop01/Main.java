package ru.javabegin.oop01;

public class Main {
    public static void main(String[] args) {
        Car nissan = new Car();
        nissan.color = "blue";
        nissan.name = "nissan";
        nissan.model = "sedan";
        nissan.drive();


        Car bmv = new Car();
        bmv.color = "red";
        bmv.name = "bmv";
        bmv.model = "crossover";
        bmv.stop();

        System.out.println("nissan = " + nissan.color);
        System.out.println("bmv = " + bmv.color);
    }
}
