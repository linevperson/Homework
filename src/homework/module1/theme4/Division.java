//Створи метод, який ділить два числа.
// Використай try-catch, щоб обробити помилку ділення на нуль і вивести повідомлення "На нуль ділити не можна".

package homework.module1.theme4;

import java.util.Scanner;

public class Division {//TODO назва класу має бути з великої літери
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Введіть перше число: ");
        int a = scan.nextInt();

        System.out.print("Введіть друге число: ");
        int b = scan.nextInt();

        int result = divide(a , b);
        System.out.println(result);
    }

    public static Integer divide(int a , int b) { //TODO назва методу має відрізнятися від назви класу
        try {
            int result = a / b;
            return result;
        } catch (ArithmeticException error) {
            return null;
        }
    }
}
