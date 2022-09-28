package create.prototype;

import java.util.HashMap;
import java.util.Map;

/**
 * 原型模式
 *
 * @author shonebin
 * @version 1.0.0
 */
public class Case2 {
    public static void main(String[] args) {
        PrototypeManager manager = PrototypeManager.getManager();

        Prototype a = manager.get("A").clone();
        Prototype a1 = manager.get("A").clone();
        Prototype b = manager.get("B").clone();
        Prototype b1 = manager.get("B").clone();

        System.out.println(a);
        System.out.println(a1);
        System.out.println(b);
        System.out.println(b1);
    }

    interface Prototype {
        Prototype clone();
    }

    static class ConcretePrototypeA implements Prototype{
        @Override
        public Prototype clone() {
            Prototype prototype = new ConcretePrototypeA();
            return prototype;
        }
    }

    static class ConcretePrototypeB implements Prototype {
        @Override
        public Prototype clone() {
            Prototype prototype = new ConcretePrototypeB();
            return prototype;
        }
    }

    static class PrototypeManager {

        private final static PrototypeManager prototypeManager = new PrototypeManager();

        private final Map<String, Prototype> prototypes = new HashMap<>();

        private PrototypeManager() {
            prototypes.put("A", new ConcretePrototypeA());
            prototypes.put("B", new ConcretePrototypeB());
        }

        public void add(String key, Prototype prototype) {
            prototypes.put(key, prototype);
        }

        public Prototype get(String key) {
            return prototypes.get(key);
        }

        public static PrototypeManager getManager() {
            return prototypeManager;
        }
    }

}
