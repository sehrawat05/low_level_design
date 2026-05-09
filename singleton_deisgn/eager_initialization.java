
class Singleton {

    static private Singleton instance = new Singleton();

    private Singleton() {
        System.out.println("Singleton instance created");
    }

    public static Singleton getInstance() {

        return instance;
    }

    public static void main(String[] args) {
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
        System.out.println(s1 == s2);
    }
}
