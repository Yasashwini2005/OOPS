public class ControlStatements {
    public static void main(String[] args) {
        int marks = 75;

        // if-else
        if (marks >= 90) {
            System.out.println("Grade A");
        } else if (marks >= 75) {
            System.out.println("Grade B");
        } else {
            System.out.println("Grade C");
        }

        // switch
        int day = 2;
        switch (day) {
            case 1: System.out.println("Monday"); break;
            case 2: System.out.println("Tuesday"); break;
            default: System.out.println("Weekend");
        }

        // for loop
        for (int i = 1; i <= 3; i++) {
            System.out.println("For loop: " + i);
        }

        // while loop
        int j = 1;
        while (j <= 3) {
            System.out.println("While loop: " + j);
            j++;
        }

        // do-while loop
        int k = 1;
        do {
            System.out.println("Do-while loop: " + k);
            k++;
        } while (k <= 3);

        // break & continue
        for (int m = 1; m <= 5; m++) {
            if (m == 3) continue;
            if (m == 5) break;
            System.out.println("Break/Continue demo: " + m);
        }
    }
}
