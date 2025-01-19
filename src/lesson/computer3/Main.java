package lesson.computer3;

/*

Задача “Компьютер”

Требуется создать класс Computer, включить и выключить его (создать объект и вызвать методы)

Объект Computer:
– свойство “name”: название (String) – сразу задаем дефолтное значение “IBM”
– метод “on”: включить – выводит в консоль текст
– метод “off”: выключить – выводит в консоль текст

Пока методы будут без параметров и без возвращаемого значения (void) - чтобы не усложнять

- Запуск -

В методе main (который находится в отдельном классе Main) создаем экземпляр Computer.

После этого вызываем 2 метода: on и off.

Каждый метод должен просто выводить информацию в консоль с помощью println, куда подставляется значение переменной name.

Пример вывода в консоль после выполнения программы:

IBM on
IBM off


 */

public class Main {

    public static void main(String[] args) {

        Computer computer = new Computer("QQ");
        computer.setName("GG");
        System.out.println(computer.name);
        computer.on();
        computer.off();
        System.out.println(computer.getName());

    }
}
