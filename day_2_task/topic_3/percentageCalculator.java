package day_2_task.topic_3;

import java.util.Scanner;

public class percentageCalculator {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter marks obtained: ");
        double obtainedMarks = sc.nextDouble();

        System.out.print("Enter total marks: ");
        double totalMarks = sc.nextDouble();

        double percentage = (obtainedMarks / totalMarks) * 100;

        System.out.println("Percentage = " + percentage + "%");

        sc.close();
    }
}
