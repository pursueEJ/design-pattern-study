package create.factorymethod;

/**
 * 工厂方法模式案例1
 *
 * @author shonebin
 * @version 1.0.0
 */
public class Case1 {

    interface Logger {
        void writeLog();
    }

    static class FileLogger implements Logger {
        @Override
        public void writeLog() {
            System.out.println("FileLogger");
        }
    }

    static class DatabaseLogger implements Logger {
        @Override
        public void writeLog() {
            System.out.println("DatabaseLogger");
        }
    }

    static class LoggerFactory {
        public static Logger createLogger(String type) {
            if ("file".equals(type)) {
                return new FileLogger();
            } else if ("database".equals(type)) {
                return new DatabaseLogger();
            }
            throw new RuntimeException("No type logger");
        }
    }
}
