//Створи перевірку очікуваного і фактичного значення:
//Створи дві змінні: expected = "Login successful" і actual = "Login successful".
//Додай умову, яка перевіряє, чи збігаються ці значення, і виводить "Тест пройдено" або "Тест не пройдено".

package homework34task5;

public class login {//TODO клас з великої літери має бути
    public static void main(String[] args) {
        String expected = "login successful" ;
        String actual = "login successful" ;

        if (expected.equals(actual)) {
            System.out.print("Успішний тест");
        } else {
            System.out.print("Тест не пройдено");
        }
    }
}

