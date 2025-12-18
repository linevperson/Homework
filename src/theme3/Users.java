package theme3;

public class Users {
    public static void main(String args[]) {
        User admin = new Admin();
        User customer = new Customer();

        System.out.println(admin.getRole());
        System.out.println(customer.getRole());

    }
}

    abstract class User {
        public abstract String getRole();
    }

    class Admin extends User {
        @Override                       //Не до кінця розумію як @Override ловить помилки
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




