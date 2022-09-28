package create.simplefactory;

/**
 * 简单工厂
 *
 * @author shonebin
 * @version 1.0.0
 */
public class Case1 {

    public static void main(String[] args) {
        Chart pie = new Chart( "pie");
        pie.display();

        Chart histogram = new Chart( "histogram");
        histogram.display();

        Chart line = new Chart( "line");
        line.display();
    }

    static class Chart {
        private final String type;

        Chart(String type) {
            this.type = type;

            if ("histogram".equals(type)) {
                System.out.println("创建柱状图");
            } else if ("pie".equals(type)) {
                System.out.println("创建饼状图");
            } else if ("line".equals(type)) {
                System.out.println("创建折线图");
            }
        }

        public void display() {
            if ("histogram".equals(type)) {
                System.out.println("显示柱状图");
            } else if ("pie".equals(type)) {
                System.out.println("显示饼状图");
            } else if ("line".equals(type)) {
                System.out.println("显示折线图");
            }
        }
    }

}
