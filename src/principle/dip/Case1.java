package principle.dip;

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

    }

    static class TXTDataConvertor {
        void readFile() {
            System.out.println("Txt Read File...");
        }
    }

    static class ExcelDataConvertor {
        void readFile() {
            System.out.println("Excel Read File...");
        }
    }

    static class CustomerDAO {
        void addCustomers() {
            System.out.println("add customers...");
        }
    }
}
