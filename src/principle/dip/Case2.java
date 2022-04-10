package principle.dip;

/**
 * <p>The class case2 was created on 2022/4/8.</p>
 * <p>
 * TODO
 * </p>
 *
 * @author shonebin
 * @version 1.0.0
 */
public class Case2 {
    public static void main(String[] args) {

    }

    static abstract class DataConvertor {
        abstract void readFile();
    }

    static class TXTDataConvertor extends DataConvertor {
        @Override
        void readFile() {
            System.out.println("Txt read file...");
        }
    }

    static class ExcelDataConvertor extends DataConvertor {
        @Override
        void readFile() {
            System.out.println("Excel read file...");
        }
    }

    static class CustomerDAO {
        void addCustomers() {
            System.out.println("add customers...");
        }
    }
}
