package day_4_task.task_4;

import java.util.Scanner;

public class revArray {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[5];

        System.out.println("Enter 5 numbers:");

        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Array in reverse order:");

        for (int i = 4; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}

