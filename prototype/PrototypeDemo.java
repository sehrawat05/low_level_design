
public class PrototypeDemo {

    // Prototype
    static abstract class Prototype {

        public abstract Prototype clone();
    }

    // Concrete Prototype
    static class Student extends Prototype {

        private String name;
        private int age;
        private String course;

        public Student(String name, int age, String course) {
            this.name = name;
            this.age = age;
            this.course = course;
        }

        // Copy Constructor
        public Student(Student other) {
            this.name = other.name;
            this.age = other.age;
            this.course = other.course;
        }

        @Override
        public Prototype clone() {
            return new Student(this);
        }

        public void setName(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "Student{"
                    + "name='" + name + '\''
                    + ", age=" + age
                    + ", course='" + course + '\''
                    + '}';
        }
    }

    public static void main(String[] args) {

        // Original object
        Student s1 = new Student("Khushi", 20, "B.Tech");

        // Clone object
        Student s2 = (Student) s1.clone();

        // Modify cloned object
        s2.setName("Rahul");

        System.out.println("Original : " + s1);
        System.out.println("Cloned   : " + s2);
    }
}
