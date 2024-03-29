package create.factorymethod;

/**
 * 工厂方法模式案例3
 *
 * @author shonebin
 * @version 1.0.0
 */
public class Case3 {

    public static void main(String[] args) {
        LoggerFactory loggerFactory = new DatabaseLoggerFactory();
        Logger logger = loggerFactory.createLogger();
        logger.writeLog();
    }

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

    interface LoggerFactory {
        Logger createLogger ();
    }

    static class FileLoggerFactory implements LoggerFactory {
        @Override
        public Logger createLogger() {
            return new FileLogger();
        }
    }

    static class DatabaseLoggerFactory implements LoggerFactory {

        @Override
        public Logger createLogger() {
            return new DatabaseLogger();
        }
    }
}
