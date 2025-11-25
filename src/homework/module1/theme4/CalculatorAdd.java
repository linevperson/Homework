// Створи в уже створеному проєкті новий клас Calculator.
//Додай до нього метод add, який приймає два числа і повертає їхню суму (використай return).
//Виклич цей метод у методі main і виведи результат.


package homework.module1.theme4;

import java.util.Scanner;

public class CalculatorAdd {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Введіть перше число: ");
        int number1 = scan.nextInt();
        System.out.print("Введіть друге число: ");
        int number2 = scan.nextInt();

        Calculator calc = new Calculator();
        int result = calc.add(number1 , number2);

        System.out.print("Сума = " + result);
    }
}
