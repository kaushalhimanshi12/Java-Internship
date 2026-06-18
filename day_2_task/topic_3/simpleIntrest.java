package day_2_task.topic_3;

import java.util.Scanner;

public class simpleIntrest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Principal Amount: ");
        double principal = sc.nextDouble();

        System.out.print("Enter Rate of Interest: ");
        double rate = sc.nextDouble();

        System.out.print("Enter Time (years): ");
        double time = sc.nextDouble();

        double si = (principal * rate * time) / 100;

        System.out.println("Simple Interest = " + si);

        sc.close();
    }
}
