package ru.javabegin.oop02Computer;

public class Main {
    public static void main(String[] args) {
        String nameCar = "nissan";
        String modelCar = "sedan";
        String colorCar = "red";
        int num1 = 0;
        int num2 = 0;

        Car nissan = new Car(nameCar, modelCar, colorCar, num1, num2);
//        Car nissan = new Car("nissan+constr", "sedan+constr", "red+constr");
        nissan.setNum1(5);
        nissan.setNum2(15);

        nissan.drive();
        System.out.println(nissan.getName()); // гет только возвращает значения для просмотра
        System.out.println(nissan.getColor()); // гет только возвращает значения для просмотра
        System.out.println(nissan.getModel()); // гет только возвращает значения для просмотра
        nissan.stop();

        int result = nissan.summNumber();
        System.out.println("result = " + result);
        nissan.summNumber();
        System.out.println(nissan.summNumber());
    }


}
