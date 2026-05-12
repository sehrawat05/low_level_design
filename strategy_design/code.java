
class code {

    static class Robot {

        Talkable t;
        Walkable w;

        void projection() {
        }

    }

    static abstract class Talkable {

        abstract void talk();
    }

    static class NormalTalk extends Talkable {

        void talk() {
            System.out.println("Normal talk");
        }
    }

    static class NoTalk extends Talkable {

        void talk() {
            System.out.println("No talk");
        }
    }

    static abstract class Walkable {

        abstract void walk();
    }

    static class NormalWalk extends Walkable {

        void walk() {
            System.out.println("Normal walk");
        }
    }

    static class NoWalk extends Walkable {

        void walk() {
            System.out.println("No walk");
        }
    }

    static class Companion extends Robot {

        @Override
        void projection() {
            System.out.println("Companion projection");
        }
    }

    public static void main(String[] args) {
        Robot robot = new Robot();
        robot.t = new NoTalk();
        robot.w = new NormalWalk();
        robot.projection();
        robot.t.talk();
        robot.w.walk();

    }
}
