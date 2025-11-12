//Створи перевірку дня тижня:
//Створи змінну з назвою дня тижня (наприклад, "Monday").
//Використай switch-case, щоб вивести "Робочий день" або "Вихідний день".

package homework;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введіть день тижня: ");
        String days = scan.nextLine();

        String day = days.toLowerCase();

        switch (day) {
            case "понеділок", "вівторок", "середа", "четвер", "п'ятниця" ->
                    System.out.println("Робочий день");
            case "субота", "неділя" ->
                    System.out.println("Вихідний день");
            default ->
                    System.out.println("Не знаю такого дня");
        }


        }




    }

