package theme3;

public class Users {
    public static void main(String args[]) {
        User admin = new Admin() ;
        // TODO(1): Тут instanceof завжди true, бо ти явно створив new Admin().
        // Це не показує реальну користь instanceof.
        // Краще зробити масив/список User з різними типами і пройтись циклом.
            if (admin instanceof Admin) {
                System.out.println("Admin");
        } else if (admin instanceof Customer) {
                System.out.println("Customer");
            }
        User customer = new Customer() ;
        // TODO(2): Аналогічно — instanceof теж очевидний.
        // TODO(3): У тебе вже є метод getRole(). Краще виводити роль через поліморфізм:
        // System.out.println(customer.getRole());
            if (customer instanceof Customer) {
                System.out.println("Customer");
            } else if (customer instanceof Admin) {
                System.out.println("Admin");

                // TODO(4): Зроби красиво:
                // User[] users = { new Admin(), new Customer() };
                // for (User u : users) { ... }
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
            return "Admin";
        }
    }

    class Customer extends User {
        @Override
        public String getRole() {
            return "Customer";
        }
    }




