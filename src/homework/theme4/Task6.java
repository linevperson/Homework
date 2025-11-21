//Напишіть метод, який реалізує лінійний пошук елемента в масиві цілих чисел. Якщо такий елемент є в масиві, то поверніть його індекс, якщо ні — метод повинен повернути число - «-1». Використовуй оператори порівняння.

package homework.theme4;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        System.out.println("Введіть число від 1 до 5:");
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();

        int[] num1 = {1,2,3,4,5};
        int foundIndex = -1;

        for (int i = 0; i < num1.length; i++) {
            if (num1[i] == num){
                foundIndex = i;
                break;
            }
        }
        if (foundIndex != -1) {
            System.out.println("Індекс = " + foundIndex);
        }
        else {
            System.out.println("Елемент не знайдено");
        }



    }

}
