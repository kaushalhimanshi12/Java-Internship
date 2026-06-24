package day_5_task.task_5;

import java.util.Scanner;

public class studentResultSystem {
     public static int calculateTotal(int m1, int m2, int m3) {
        return m1 + m2 + m3;
    }

    // Method to calculate percentage
    public static double calculatePercentage(int total) {
        return (total / 300.0) * 100;
    }

    // Method to check Pass/Fail
    public static String checkResult(double percentage) {
        if (percentage >= 40) {
            return "Pass";
        } else {
            return "Fail";
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter marks of Subject 1: ");
         int m1 = sc.nextInt();

        System.out.print("Enter marks of Subject 2: ");
        int m2 = sc.nextInt();

        System.out.print("Enter marks of Subject 3: ");
        int m3 = sc.nextInt();

        int total = calculateTotal(m1, m2, m3);
        double percentage = calculatePercentage(total);
        String result = checkResult(percentage);

        System.out.println("\n----- Student Result -----");
        System.out.println("Total Marks = " + total);
        System.out.println("Percentage = " + percentage + "%");
        System.out.println("Result = " + result);

        sc.close();
    }
}
