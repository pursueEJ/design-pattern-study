package simplefactory;

/**
 * <p>The class Case2 was created on 2022/4/10.</p>
 * <p>
 * TODO
 * </p>
 *
 * @author shonebin
 * @version 1.0.0
 */
public class Case2 {


    static abstract class Product {}

    static class ProductA extends Product {}

    static class ProductB extends Product {}

    static class Factory {
        public static Product factoryMethod(String type) {
            if ("A".equals(type)) {
                return new ProductA();
            } else if ("B".equals(type)) {
                return new ProductB();
            }
            throw new RuntimeException("no type class...");
        }
    }


}
