package create.factorymethod;

/**
 * 工厂方法模式案例2
 *
 * @author shonebin
 * @version 1.0.0
 */
public class Case2 {

    interface Product { }

    static class ConcreteProduct implements Product { }

    interface Factory {
        Product factoryMethod();
    }

    static class ConcreteFactory implements Factory {
        @Override
        public Product factoryMethod() {
            return new ConcreteProduct();
        }
    }
}
