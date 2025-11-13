//Створи перевірку віку:
//Якщо вік менше 18 — виведи "Доступ заборонено".
//Якщо від 18 і більше — виведи "Доступ дозволено".
//Використай if-else конструкцію.

package homework;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Введіть ваш вік:");
    int userAge = input.nextInt();
    if (userAge >= 18) {
        System.out.println("Вхід дозволено");
    } else {
        System.out.println("Відхилено");
    }

test2

}

}
