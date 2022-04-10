package principle.srp;

/**
 * <p>The class Case2 was created on 2022/4/6.</p>
 * <p>
 * TODO
 * </p>
 *
 * @author shonebin
 * @version 1.0.0
 */
public class Case2 {

    static class CustomerDataChart {
        private final CustomerDAO dao = new CustomerDAO();

        public void createChart() {
            System.out.println("创建图表");
        }

        public void displayChart() {
            System.out.println("显示图表");
        }
    }

    static class CustomerDAO {
        private final DBUtil util = new DBUtil();

        public void findCustomer() {
            System.out.println("查找数据");
        }
    }

    static class DBUtil {
        void getConnection() {
            System.out.println("获取连接...");
        }
    }
}
