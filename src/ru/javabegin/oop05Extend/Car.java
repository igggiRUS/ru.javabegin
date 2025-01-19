package ru.javabegin.oop05Extend;
// машину расширили до транспорта
// дочерний класс может, но не обязан добавлять функционал
public class Car extends Transport{

private int number; // все машины должны иметь номер

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
// уникальный метод только для car и всех его дочерних классов
    public void signal() {
        System.out.println(" signal ");
    }
}
