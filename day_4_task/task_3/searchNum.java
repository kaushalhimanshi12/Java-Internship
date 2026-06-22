package day_4_task.task_3;

import java.util.Scanner;

public class searchNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[5];

        System.out.println("Enter 5 numbers:");

        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter number to search: ");
        int search = sc.nextInt();

        boolean found = false;
         for (int i = 0; i < 5; i++) {
            if (arr[i] == search) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("Number found in array.");
        } else {
            System.out.println("Number not found in array.");
        }

        sc.close();
    }
}
