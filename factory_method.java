
public class factory_method {

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

    static class BasicWheatBurger extends Burger {

        @Override
        public void prepare() {
            System.out.println("Preparing basic wheat burger");
        }
    }

    static class StandardWheatBurger extends Burger {

        @Override
        public void prepare() {
            System.out.println("Preparing standard wheat burger");
        }
    }

    static class PremiumWheatBurger extends Burger {

        @Override
        public void prepare() {
            System.out.println("Preparing premium wheat burger");
        }
    }

    static class BurgerFactory {

        public Burger createBurger(String type) {
            return null;
        }
    }

    static class KingBurger extends BurgerFactory {

        @Override
        public Burger createBurger(String type) {
            if (type.equals("basic")) {
                return new BasicBurger();
            } else if (type.equals("standard")) {
                return new StandardBurger();
            } else if (type.equals("premium")) {
                return new PremiumBurger();
            }
            return null;
        }
    }

    static class SinghBurger extends BurgerFactory {

        @Override
        public Burger createBurger(String type) {
            if (type.equals("basic wheat")) {
                return new BasicWheatBurger();
            } else if (type.equals("standard wheat")) {
                return new StandardWheatBurger();
            } else if (type.equals("premium wheat")) {
                return new PremiumWheatBurger();
            }
            return null;
        }
    }

    public static void main(String[] args) {
        BurgerFactory factory = new SinghBurger();
        Burger burger = factory.createBurger("basic wheat");
        burger.prepare();
    }
}
