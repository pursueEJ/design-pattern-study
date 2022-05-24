package singleton;

/**
 * <p>The class Case2 was created on 2022/5/24.</p>
 * <p>
 * 双重锁校验
 * </p>
 *
 * @author shonebin
 * @version 1.0.0
 */
public class Case3 {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            new Thread(() -> System.out.println(Singleton3.getInstance())).start();
        }
    }
}

class Singleton3 {
    private volatile static Singleton3 instance = null;

    private Singleton3() {
    }

    public static Singleton3 getInstance() {
        if (instance == null) {
            synchronized (Singleton3.class) {
                if (instance == null) {
                    instance = new Singleton3();
                }
            }
        }
        return instance;
    }
}