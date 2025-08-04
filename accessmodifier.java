public class StudentAccess {
    public static String college = "ABC College";

    public String getName() {
        return "Yasashwini";
    }

    public static void main(String[] args) {
        StudentAccess s = new StudentAccess();
        System.out.println("Name: " + s.getName());
        System.out.println("College: " + college);
    }
}



abstract class Student {
    String name = "Yasashwini";

    public abstract void displayDetails();
}

class CollegeStudent extends Student {
    public void displayDetails() {
        System.out.println("Student Name: " + name);
    }

    public static void main(String[] args) {
        CollegeStudent cs = new CollegeStudent();
        cs.displayDetails();
    }
}
