package ru.javabegin.oop02GettSett;

public class Car {
    private String name; // свойства поля fields (характеристика) которая описывает внутри класса (вне метода)
    private String model; // свойства поля fields (характеристика) которая описывает внутри класса (вне метода)
    private String color; // свойства поля fields (характеристика) которая описывает внутри класса (вне метода)

    public String getName() { // properties свойства
        return name;
    }

    public void setName(String name) { // properties свойства
        this.name = name;
    }

    public String getModel() { // properties свойства
        return model;
    }

    public void setModel(String model) { // properties свойства
        this.model = model;
    }

    public String getColor() { // properties свойства
        return color;
    }

    public void setColor(String color) { // properties свойства
        this.color = color;
    }

    void drive() {
        System.out.println("drive method");
    }

    void stop() {
        System.out.println("stop method");

    }

}
