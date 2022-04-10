package principle.srp;

/**
 * <p>The class Case1 was created on 2022/4/6.</p>
 * <p>
 * TODO
 * </p>
 *
 * @author shonebin
 * @version 1.0.0
 */
public class Case1 {

    public static void main(String[] args) {
        CustomerDataChart chart = new CustomerDataChart();
        chart.getConnection();
        chart.findCustomers();
        chart.createChart();
        chart.displayChart();
    }

    static class CustomerDataChart {
        public void getConnection() {
            System.out.println("获取连接...");
        }

        public void findCustomers() {
            System.out.println("查找数据...");
        }

        public void createChart() {
            System.out.println("创建图表...");
        }

        public void displayChart() {
            System.out.println("显示图表...");
        }
    }
}
