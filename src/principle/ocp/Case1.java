package principle.ocp;

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
        ChartDisplay chartDisplay = new ChartDisplay();
        chartDisplay.display("pie");
        chartDisplay.display("bar");
    }

    static class ChartDisplay {
        public void display(String type) {
            if ("pie".equals(type)) {
                new PieChart().display();
            } else if ("bar".equals(type)) {
                new BarChart().display();
            }
        }
    }

    static class PieChart {
        void display() {
            System.out.println("饼状图显示");
        }
    }

    static class BarChart {
        void display() {
            System.out.println("柱状图显示");
        }
    }

}
