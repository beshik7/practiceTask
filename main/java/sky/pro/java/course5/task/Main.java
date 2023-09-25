package sky.pro.java.course5.task;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("John", 21);
        Student student2 = new Student("John", 21);
        System.out.println(student1.equals(student2));
        System.out.println(student1.hashCode() == student2.hashCode());
    }
}
