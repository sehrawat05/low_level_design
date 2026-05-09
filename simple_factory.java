
public class simple_factory {

    static class Burger {

        public void prepare() {
        }

    }

    static class BasicBurger extends Burger {

        @Override
        public void prepare() {
            System.out.println("Preparing basic burger");
        }
    }

    static class StandardBurger extends Burger {

        @Override
        public void prepare() {
            System.out.println("Preparing standard burger");
        }
    }

    static class PremiumBurger extends Burger {

        @Override
        public void prepare() {
            System.out.println("Preparing premium burger");
        }
    }

    static class BurgerFactory {

        public Burger createBurger(String type) {
            if (type.equalsIgnoreCase("basic")) {
                return new BasicBurger();
            } else if (type.equalsIgnoreCase("standard")) {
                return new StandardBurger();
            } else if (type.equalsIgnoreCase("premium")) {
                return new PremiumBurger();
            }
            return null;
        }
    }

    public static void main(String[] args) {
        BurgerFactory factory = new BurgerFactory();
        Burger burger = factory.createBurger("basic");
        burger.prepare();
    }
}
