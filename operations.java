public class StudentOperations {
    public static void main(String[] args) {
        int a = 85, b = 90;

        // Arithmetic
        int total = a + b;
        System.out.println("Total: " + total);

        // Relational
        System.out.println("Is a greater than b? " + (a > b));

        // Logical
        boolean passed = (a > 40) && (b > 40);
        System.out.println("Both passed? " + passed);

        // Assignment
        int avg = total / 2;

        // Unary
        avg++;
        System.out.println("Average (after increment): " + avg);

        // Bitwise
        System.out.println("Bitwise AND: " + (a & b));

        // Ternary
        String result = (avg >= 50) ? "Pass" : "Fail";
        System.out.println("Result: " + result);
    }
}
