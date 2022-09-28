package create.simplefactory;

/**
 * 简单工厂
 *
 * @author shonebin
 * @version 1.0.0
 */
public class Case3 {

    static abstract class Chart {
        abstract void display();
    }

    static class PieChart extends Chart {
        PieChart() {
            System.out.println("创建饼状图");
        }

        @Override
        void display() {
            System.out.println("显示饼状图");
        }
    }

    static class HistogramChart extends Chart {
        HistogramChart() {
            System.out.println("创建柱状图");
        }

        @Override
        void display() {
            System.out.println("显示住状图");
        }
    }

    static class LineChart extends Chart {
        LineChart() {
            System.out.println("创建折线图");
        }

        @Override
        void display() {
            System.out.println("显示折线图");
        }
    }

    static class ChartFactory {
        public Chart getChart(String type) {
            if ("pie".equals(type)) {
                return new PieChart();
            } else if ("line".equals(type)) {
                return new LineChart();
            } else if ("histogram".equals(type)) {
                return new HistogramChart();
            }
            throw new RuntimeException("has no chart type...");
        }
    }


}
