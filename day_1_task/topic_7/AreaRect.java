package day_1_task.topic_7;

import java.util.Scanner;

public class AreaRect {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter length: ");
        double length = sc.nextDouble();

        System.out.print("Enter width: ");
        double width = sc.nextDouble();

        double area = length * width;

        System.out.println("Area of Rectangle = " + area);

        sc.close();
    }
}
