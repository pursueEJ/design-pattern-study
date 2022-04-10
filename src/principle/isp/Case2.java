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
public class Case2 {

    static interface DataHandler {
        void dataRead();
    }

    static interface XmlTransformer {
        void transformToXml();
    }
    static interface ChartHandler {
        void createChart();
        void displayChart();
    }

    static interface ReportHandler {
        void createReport();
        void displayReport();
    }

    static class ConcreteClass implements DataHandler, ChartHandler {

        @Override
        public void dataRead() {
            System.out.println("read...");
        }

        @Override
        public void createChart() {
            System.out.println("chart creating...");
        }

        @Override
        public void displayChart() {
            System.out.println("chart displaying...");
        }
    }

    static class Client {

    }
}
