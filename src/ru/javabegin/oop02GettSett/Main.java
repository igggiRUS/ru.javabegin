package ru.javabegin.oop02GettSett;

public class Main {
    public static void main(String[] args) {
        Car nissan = new Car();
        nissan.setColor("blue"); // эти значения передаются в сеттер
        nissan.setName("nissan"); // эти значения передаются в сеттер
        nissan.setModel("sedan"); // эти значения передаются в сеттер


        Car bmv = new Car();
        bmv.setColor("red"); // эти значения передаются в сеттер
        bmv.setName("bmv"); // эти значения передаются в сеттер
        bmv.setModel("crosssover"); // эти значения передаются в сеттер

        nissan.drive();
        System.out.println(nissan.getName()); // гет только возвращает значения для просмотра
        System.out.println(nissan.getColor()); // гет только возвращает значения для просмотра
        System.out.println(nissan.getModel()); // гет только возвращает значения для просмотра
        nissan.stop();

        bmv.drive();
        System.out.println(bmv.getName()); // гет только возвращает значения для просмотра
        System.out.println(bmv.getColor()); // гет только возвращает значения для просмотра
        System.out.println(bmv.getModel()); // гет только возвращает значения для просмотра
        bmv.stop();

        System.out.println(nissan.getName());
        System.out.println(bmv.getName());
        System.out.println(nissan.getName());

    }
}
