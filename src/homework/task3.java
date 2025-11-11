//Створи перевірку віку:
//Якщо вік менше 18 — виведи "Доступ заборонено".
//Якщо від 18 і більше — виведи "Доступ дозволено".
//Використай if-else конструкцію.

package homework;

import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.print("Введіть ваш вік:");
    int user = scan.nextInt();
    if (user >= 18) {
        System.out.println("Вхід дозволено");
    } else {
        System.out.println("Відхилено");
    }



}

}
