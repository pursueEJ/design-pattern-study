package principle.lsp;

/**
 * <p>The class Case1 was created on 2022/4/8.</p>
 * <p>
 * TODO
 * </p>
 *
 * @author shonebin
 * @version 1.0.0
 */
public class Case2 {

    public static void main(String[] args) {
        EmailSender sender = new EmailSender();
        sender.send(new VIPCustomer());
        sender.send(new CommonCustomer());
    }

    static abstract class Customer {
        private String name;
        private String email;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }
    }

    static class VIPCustomer extends Customer{

    }

    static class CommonCustomer extends Customer {

    }

    static class EmailSender {
        public void send(Customer customer) {
            System.out.println(customer.getName() + " send " + customer.getName());
        }

    }
}
