package singleton;

/**
 * <p>The class Case1 was created on 2022/5/24.</p>
 * <p>
 * 饿汉式
 * </p>
 *
 * @author shonebin
 * @version 1.0.0
 */
public class Case1 {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            new Thread(() -> System.out.println(Singleton1.getInstance())).start();
        }
    }
}

class Singleton1 {
    private static final Singleton1 instance = new Singleton1();

    private Singleton1() { }

    public static Singleton1 getInstance() {
        return instance;
    }
}