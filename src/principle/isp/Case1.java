package principle.isp;

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
    
    static interface ConcreteClass {
        void dataRead();
        void transformToXml();
        void createChart();
        void displayChart();
        void createReport();
        void displayReport();
    }

    static class CustomerDataDisplay implements ConcreteClass {

        @Override
        public void dataRead() {
            System.out.println("read...");
        }

        @Override
        public void transformToXml() {
            System.out.println("xml...");
        }

        @Override
        public void createChart() {
            System.out.println("chart creating...");
        }

        @Override
        public void displayChart() {
            System.out.println("chart displaying...");
        }

        @Override
        public void createReport() {
            System.out.println("report creating");
        }

        @Override
        public void displayReport() {
            System.out.println("report displaying");
        }
    }

    static class Client {

    }
}
