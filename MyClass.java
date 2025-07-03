import java.util.Scanner;

// Define a class using OOP
class Employee {
    // Encapsulated fields
    private String name;
    private int age;
    private double salary;

    // Constructor
    public Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    // Display method
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);
    }

    // Example of method overloading
    public void displayDetails(boolean showSalary) {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        if (showSalary)
            System.out.println("Salary: " + salary);
    }
}

public class MyClass {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);

        System.out.println("Enter name, age and salary:");

        String name = myObj.nextLine();
        int age = myObj.nextInt();
        double salary = myObj.nextDouble();

        // Create an object
        Employee emp = new Employee(name, age, salary);

        // Call display method
        emp.displayDetails(); // or emp.displayDetails(true);
        
        myObj.close();
    }
}
