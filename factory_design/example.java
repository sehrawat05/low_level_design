
public class example {

    abstract static class Product {

        public abstract void doStuff();
    }

    static class ProductA extends Product {

        @Override
        public void doStuff() {
            System.out.println("Doing stuff FOR PRODUCT A");
        }
    }

    static class ProductB extends Product {

        @Override
        public void doStuff() {
            System.out.println("Doing stuff FOR PRODUCT B");
        }
    }

    static class Creator {

        public Product createProduct(String type) {
            if (type.equals("A")) {
                return new ProductA();
            } else if (type.equals("B")) {
                return new ProductB();
            }
            return null;
        }
    }

    public static void main(String[] args) {
        Creator c = new Creator();
        c.createProduct("A").doStuff();
        c.createProduct("B").doStuff();
    }
}
