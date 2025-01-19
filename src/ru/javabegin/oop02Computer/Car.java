package ru.javabegin.oop02Computer;

public class
Car {
    // минимальный набор пустой конструктор и конструктор со всеми параметрами (правила хорошего тона)
    public Car() {
    }

    public Car(String name, String model, String color, int num1, int num2) {
        this.name = name; // свойства, но уже в конструкторе >> свойства (характеристика) которая описывает внутри класса (вне метода)
        this.model = model; // свойства, но уже в конструкторе >> свойства (характеристика) которая описывает внутри класса (вне метода)
        this.color = color; // свойства, но уже в конструкторе >> свойства (характеристика) которая описывает внутри класса (вне метода)
    }

    private String name; // свойства поля fields (характеристика) которая описывает внутри класса (вне метода)
    private String model; // свойства поля fields (характеристика) которая описывает внутри класса (вне метода)
    private String color; // свойства поля fields (характеристика) которая описывает внутри класса (вне метода)
    private int num1;
    private int num2;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    void drive() {
        System.out.println("drive method");
    }

    void stop() {
        System.out.println("stop method");

    }

    public int summNumbers(int num1, int num2) {
        return num1 + num2;
    }

    public int summNumber() {
        return 0;
    }
}
