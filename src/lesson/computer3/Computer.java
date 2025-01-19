package lesson.computer3;

public class Computer {

    String name; // свойство (поле) класса


    public Computer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    void on(){
        System.out.println(name + " on");
    }

    void off(){
        System.out.println(name + " off");
    }

    public Computer() {
    }
}
