package create.singleton;

/**
 * <p>The class Case2 was created on 2022/5/24.</p>
 * <p>
 * 静态内部类
 * </p>
 *
 * @author shonebin
 * @version 1.0.0
 */
public class Case4 {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            new Thread(() -> System.out.println(Singleton4.getInstance())).start();
        }
    }
}

class Singleton4 {
    private Singleton4() { }

    private static class SingletonHolder {
        private final static Singleton4 instance = new Singleton4();
    }

    public static Singleton4 getInstance() {
        return SingletonHolder.instance;
    }
}