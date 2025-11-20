//Створи масив з п'яти імен студентів. Пройдися по ньому циклом і виведи кожне ім'я в консоль.

package homework;

public class Task2h2 {
    public static void main (String[] args) {

        String[] students = {"Іван", "Сергій", "Олександр", "Валерія", "Максим"};

        for (String student : students) {
            System.out.println(student);
        }
    }
}
