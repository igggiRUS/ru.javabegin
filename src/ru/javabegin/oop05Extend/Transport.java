package ru.javabegin.oop05Extend;

// класс с общим поеведением для всех транспортов
// все что умеет транспорт умеет и кар
public class Transport {
    // fields properties свойства поля
  private String name;
  private String model;
  private String color;

    // get/set
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

    //бизнес методы

    void drive() {
        System.out.println("name = drive " + name);
    }

    void stop() {
        System.out.println("name = stop " + name);

    }
}
