package create.singleton;

/**
 * <p>The class Case2 was created on 2022/5/24.</p>
 * <p>
 * 存在线程安全问题
 * </p>
 *
 * @author shonebin
 * @version 1.0.0
 */
public class Case2 {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            new Thread(() -> System.out.println(Singleton2.getInstance())).start();
        }
    }
}

class Singleton2 {
    private static Singleton2 instance = null;

    private Singleton2() {
    }

    public static Singleton2 getInstance() {
        if (instance == null) {
            synchronized (Singleton2.class) {
                instance = new Singleton2();
            }
        }
        return instance;
    }
}