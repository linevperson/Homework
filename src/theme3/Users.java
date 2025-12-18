package theme3;

public class Users {
    public static void main(String args[]) {
        User admin = new Admin() ;
            if (admin instanceof Admin) {
                System.out.println("Admin");
        } else if (admin instanceof Customer) {
                System.out.println("Customer");
            }
        User customer = new Customer() ;
            if (customer instanceof Customer) {
                System.out.println("Customer");
            } else if (customer instanceof Admin) {
                System.out.println("Admin");
            }
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




