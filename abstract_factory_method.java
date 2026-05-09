
public class abstract_factory_method {

    public static class Burger {

        public void prepare() {
        }
    }

    public static class BasicBurger extends Burger {

        @Override
        public void prepare() {
            System.out.println("Preparing basic burger");
        }
    }

    public static class StandardBurger extends Burger {

        @Override
        public void prepare() {
            System.out.println("Preparing standard burger");
        }
    }

    public static class PremiumBurger extends Burger {

        @Override
        public void prepare() {
            System.out.println("Preparing premium burger");
        }
    }

    public static class BasicWheatBurger extends Burger {

        @Override
        public void prepare() {
            System.out.println("Preparing basic wheat burger");
        }
    }

    public static class StandardWheatBurger extends Burger {

        @Override
        public void prepare() {
            System.out.println("Preparing standard wheat burger");
        }
    }

    public static class PremiumWheatBurger extends Burger {

        @Override
        public void prepare() {
            System.out.println("Preparing premium wheat burger");
        }
    }

    public static class GarlicBread {

        public void prepare() {
        }
    }

    public static class BasicGarlicBread extends GarlicBread {

        @Override
        public void prepare() {
            System.out.println("Preparing basic garlic bread");
        }
    }

    public static class StandardGarlicBread extends GarlicBread {

        @Override
        public void prepare() {
            System.out.println("Preparing standard garlic bread");
        }
    }

    public static class PremiumGarlicBread extends GarlicBread {

        @Override
        public void prepare() {
            System.out.println("Preparing premium garlic bread");
        }
    }

    public static class BasicWheatGarlicBread extends GarlicBread {

        @Override
        public void prepare() {
            System.out.println("Preparing basic wheat garlic bread");
        }
    }

    public static class StandardWheatGarlicBread extends GarlicBread {

        @Override
        public void prepare() {
            System.out.println("Preparing standard wheat garlic bread");
        }
    }

    public static class PremiumWheatGarlicBread extends GarlicBread {

        @Override
        public void prepare() {
            System.out.println("Preparing premium wheat garlic bread");
        }
    }

    public static class Factory {

        public Burger createBurger(String type) {
            return null;
        }

        public GarlicBread createGarlicBread(String type) {
            return null;
        }
    }

    public static class SinghFactory extends Factory {

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

        @Override
        public GarlicBread createGarlicBread(String type) {

            if (type.equals("basic wheat")) {
                return new BasicWheatGarlicBread();

            } else if (type.equals("standard wheat")) {
                return new StandardWheatGarlicBread();

            } else if (type.equals("premium wheat")) {
                return new PremiumWheatGarlicBread();
            }

            return null;
        }
    }

    public static class KingFactory extends Factory {

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

        @Override
        public GarlicBread createGarlicBread(String type) {

            if (type.equals("basic")) {
                return new BasicGarlicBread();

            } else if (type.equals("standard")) {
                return new StandardGarlicBread();

            } else if (type.equals("premium")) {
                return new PremiumGarlicBread();
            }

            return null;
        }
    }

    public static void main(String[] args) {

        Factory factory = new SinghFactory();

        Burger burger = factory.createBurger("basic wheat");

        GarlicBread garlicBread
                = factory.createGarlicBread("basic wheat");

        burger.prepare();

        garlicBread.prepare();
    }
}
