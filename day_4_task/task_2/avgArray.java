package day_4_task.task_2;

import java.util.Scanner;

public class avgArray {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[5];
        int sum = 0;
        double average;

        System.out.println("Enter 5 numbers:");

        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
            sum += arr[i];
        }

        average = (double) sum / 5;

        System.out.println("Average = " + average);

        sc.close();
    }
}
