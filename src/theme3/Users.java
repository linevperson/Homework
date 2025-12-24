package theme3;

public class Users {
    public static void main(String args[]) {
        User[] users = { new Admin(), new Customer() };
        for (User u : users) {
            System.out.print(u.getRole());
        }
    }
}

    abstract class User {
        // TODO(5): Можна додати поле name або id (не обов’язково для цього ДЗ),
        // щоб показати, що абстрактний клас містить і поведінку, і стан
        public abstract String getRole();
    }

    class Admin extends User {
        @Override
        // TODO(6): @Override змушує компілятор перевірити, що ти справді перевизначаєш метод.
        // Якщо помилишся у назві/параметрах — буде помилка компіляції, і це добре
        public String getRole() {
            return "Admin ";
        }
    }

    class Customer extends User {
        @Override
        public String getRole() {
            return "Customer ";
        }
    }




