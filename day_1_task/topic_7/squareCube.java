package day_1_task.topic_7;

import java.util.Scanner;

public class squareCube {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int square = num * num;
        int cube = num * num * num;

        System.out.println("Square = " + square);
        System.out.println("Cube = " + cube);

        sc.close();
    }
}
