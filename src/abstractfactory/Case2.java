package abstractfactory;

/**
 * <p>The class Case2 was created on 2022/4/13.</p>
 * <p>
 * TODO
 * </p>
 *
 * @author shonebin
 * @version 1.0.0
 */
public class Case2 {

    public static void main(String[] args) {
        Factory factory = new ConcreteFactory1();
        ProductA productA = factory.createProductA();
        ProductB productB = factory.createProductB();
    }

    interface ProductA {}
    static class ConcreteProductA1 implements ProductA {}
    static class ConcreteProductA2 implements ProductA {}

    interface ProductB {}
    static class ConcreteProductB1 implements ProductB {}
    static class ConcreteProductB2 implements ProductB {}

    interface Factory {
        ProductA createProductA();
        ProductB createProductB();
    }
    static class ConcreteFactory1 implements Factory {
        @Override
        public ProductA createProductA() {
            return new ConcreteProductA1();
        }

        @Override
        public ProductB createProductB() {
            return new ConcreteProductB1();
        }
    }
    static class ConcreteFactory2 implements Factory {
        @Override
        public ProductA createProductA() {
            return new ConcreteProductA2();
        }

        @Override
        public ProductB createProductB() {
            return new ConcreteProductB2();
        }
    }


}
