package factorymethod;

/**
 * <p>The class Case2 was created on 2022/4/12.</p>
 * <p>
 * TODO
 * </p>
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
