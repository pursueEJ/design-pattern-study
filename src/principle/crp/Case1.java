package principle.crp;

/**
 * <p>The class Case1 was created on 2022/4/10.</p>
 * <p>
 * TODO
 * </p>
 *
 * @author shonebin
 * @version 1.0.0
 */
public class Case1 {

    static class DBUtil {
        public void getConnection() {
            System.out.println("get Connection");
        }
    }

    static class CustomerDAO extends DBUtil {
        private void addCustomers() {
            super.getConnection();
            System.out.println("add customer");
        }
    }

}
