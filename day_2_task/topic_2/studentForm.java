package day_2_task.topic_2;

import java.util.Scanner;

public class studentForm {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Roll Number: ");
        int rollNo = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Branch: ");
        String branch = sc.nextLine();

        System.out.print("Enter Percentage: ");
        double percentage = sc.nextDouble();

        System.out.println("\n===== STUDENT INFORMATION =====");
        System.out.println("Name       : " + name);
        System.out.println("Roll No    : " + rollNo);
        System.out.println("Branch     : " + branch);
        System.out.println("Percentage : " + percentage + "%");

        sc.close();
    }
}
