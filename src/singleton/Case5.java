package singleton;

/**
 * <p>The class Case2 was created on 2022/5/24.</p>
 * <p>
 * 静态内部类
 * </p>
 *
 * @author shonebin
 * @version 1.0.0
 */
public class Case5 {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            new Thread(Singleton5.instance::display).start();
        }
    }
}

enum Singleton5 {
    instance;

    public void display() {
        System.out.println(this);
    }
}