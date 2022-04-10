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
public class Case1 {

    public static void main(String[] args) {
        EmailSender sender = new EmailSender();
        sender.send(new VIPCustomer());
        sender.send(new CommonCustomer());
    }

    static class VIPCustomer {
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

    static class CommonCustomer {
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

    static class EmailSender {
        public void send(VIPCustomer customer) {
            System.out.println(customer.getName() + " send " + customer.getName());
        }


        public void send(CommonCustomer customer) {
            System.out.println(customer.getName() + " send " + customer.getName());
        }
    }
}
