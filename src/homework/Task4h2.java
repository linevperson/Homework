//Створи метод, який ділить два числа.
// Використай try-catch, щоб обробити помилку ділення на нуль і вивести повідомлення "На нуль ділити не можна".

package homework;

import java.util.Scanner;

public class Task4h2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Введіть перше число: ");
        int a = scan.nextInt();

        System.out.print("Введіть друге число: ");
        int b = scan.nextInt();

        division(a , b);
    }

    public static void division(int a , int b) {
        try {
            int result = a / b;
            System.out.print("Результат: " + result);
        } catch (ArithmeticException error) {
            System.out.print("Не можна ділити на нуль");
        }
    }
}
