//Створи метод, який ділить два числа.
// Використай try-catch, щоб обробити помилку ділення на нуль і вивести повідомлення "На нуль ділити не можна".

package homework34task4;

import java.util.Scanner;

public class division {//TODO назва класу має бути з великої літери
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Введіть перше число: ");
        int a = scan.nextInt();

        System.out.print("Введіть друге число: ");
        int b = scan.nextInt();

        division(a , b);
    }

    public static Integer division(int a , int b) { //TODO назва методу має відрізнятися від назви класу
        try {
            int result = a / b;
            System.out.print("Результат: " + result);
            return result;
        } catch (ArithmeticException error) {
            System.out.print("Не можна ділити на нуль");
            return null;
        }
    }
}
