package principle.crp;

/**
 * <p>The class Case2 was created on 2022/4/10.</p>
 * <p>
 * TODO
 * </p>
 *
 * @author shonebin
 * @version 1.0.0
 */
public class Case2 {


    static abstract class DBUtil {
        abstract void getConnection();
    }

    static class OracleDBUtil extends DBUtil {
        @Override
        void getConnection() {
            System.out.println("get oracle connection");
        }
    }

    static class MysqlDBUtil extends DBUtil {
        @Override
        void getConnection() {
            System.out.println("get mysql connection");
        }
    }

    static class CustomerDAO {
        private DBUtil util;

        public void setUtil(DBUtil util) {
            this.util = util;
        }

        private void addCustomer() {
            util.getConnection();
            System.out.println("add customer");
        }
    }
}
