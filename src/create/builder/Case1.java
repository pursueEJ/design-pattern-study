package create.builder;

public class Case1 {

    public static void main(String[] args) {
        Builder builder = new ConcreteBuilder();
        Director director = new Director(builder);
        Product product = director.construct();

        System.out.println(product);
    }

    static class Product {
        private String partA;

        private String partB;

        private String partC;

        public String getPartA() {
            return partA;
        }

        public void setPartA(String partA) {
            this.partA = partA;
        }

        public String getPartB() {
            return partB;
        }

        public void setPartB(String partB) {
            this.partB = partB;
        }

        public String getPartC() {
            return partC;
        }

        public void setPartC(String partC) {
            this.partC = partC;
        }
    }

    interface Builder {

        void buildPartA();

        void buildPartB();

        void buildPartC();

        Product getResult();
    }

    static class ConcreteBuilder implements Builder {

        private final Product product = new Product();

        @Override
        public void buildPartA() {
            product.setPartA("Concrete Build PartA");
        }

        @Override
        public void buildPartB() {
            product.setPartA("Concrete Build PartC");
        }

        @Override
        public void buildPartC() {
            product.setPartA("Concrete Build PartC");
        }

        @Override
        public Product getResult() {
            return product;
        }
    }

    static class Director {
        private Builder builder;

        public Director(Builder builder) {
            this.builder = builder;
        }

        public void setBuilder(Builder builder) {
            this.builder = builder;
        }

        public Product construct() {
            builder.buildPartA();
            builder.buildPartB();
            builder.buildPartC();
            return builder.getResult();
        }
    }

}
