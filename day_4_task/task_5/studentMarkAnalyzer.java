package day_4_task.task_5;

import java.util.Scanner;

public class studentMarkAnalyzer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] marks = new int[5];
        int total = 0;
        double percentage;

        System.out.println("Enter marks of 5 subjects:");

        for (int i = 0; i < 5; i++) {
            marks[i] = sc.nextInt();
            total += marks[i];
        }

        percentage = total / 5.0;

        System.out.println("Total Marks = " + total);
        System.out.println("Percentage = " + percentage + "%");
         if (percentage >= 40) {
            System.out.println("Result = Pass");
        } else {
            System.out.println("Result = Fail");
        }

        sc.close();
    }
}

