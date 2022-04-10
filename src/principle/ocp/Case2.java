package principle.ocp;

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


    public static void main(String[] args) {
        ChartDisplay chartDisplay1 = new ChartDisplay();
        chartDisplay1.setChart(new PieChart());
        chartDisplay1.display();

        ChartDisplay chartDisplay2 = new ChartDisplay();
        chartDisplay2.setChart(new BarChart());
        chartDisplay2.display();
    }

    static class ChartDisplay {
        private AbstractChart chart;

        public void setChart(AbstractChart chart) {
            this.chart = chart;
        }

        public void display() {
            this.chart.display();
        }
    }

    static abstract class AbstractChart {
        abstract void display();
    }

    static class PieChart extends AbstractChart {
        @Override
        void display() {
            System.out.println("饼状图显示");
        }
    }

    static class BarChart extends AbstractChart {
        @Override
        void display() {
            System.out.println("柱状图显示");
        }
    }

}
