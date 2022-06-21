package prototype;

/**
 * <p>The class Case1 was created on 2022/6/21.</p>
 * <p>
 * 原型模式：案例1
 * </p>
 *
 * @author shonebin
 * @version 1.0.0
 */
public class Case1 {

    public static void main(String[] args) {
        Prototype prototype = new ConcretePrototype();
        Prototype clone = prototype.clone();
    }

    interface Prototype {
        Prototype clone();
    }

    static class ConcretePrototype implements Prototype {

        @Override
        public Prototype clone() {
            Prototype prototype = new ConcretePrototype();
            System.out.println("克隆原型...");
            return prototype;
        }
    }

}
