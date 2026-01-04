//Створи метод, який ділить одне число на інше і:
//Додай обробку винятку для ділення на нуль через try-catch.
//Додай блок finally, який виводить "Операція завершена".

package theme4;

import java.util.Scanner;

public class Divider {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть перше число: ");
        int number1 = scanner.nextInt();

        System.out.print("Введіть друге число: ");
        int number2 = scanner.nextInt();

        int result = divide(number1, number2);
        System.out.println("Результат: " + result);

        scanner.close();

    }

    public static int divide (int a , int b) {
        int result = 0;
        try {
            result = a / b;
        } catch (ArithmeticException e) {
            System.out.println("Помилка! Ділення на нуль!");
        } finally {
            System.out.println("Операція завершена");
        }
        return result;
    }
}
