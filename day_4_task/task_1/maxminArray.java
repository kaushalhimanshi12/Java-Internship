package day_4_task.task_1;

import java.util.Scanner;

public class maxminArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numbers = new int[5];

        System.out.println("Enter 5 numbers:");

        for (int i = 0; i < 5; i++) {
            numbers[i] = sc.nextInt();
        }

        int max = numbers[0];
        int min = numbers[0];

        for (int i = 1; i < 5; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
          if (numbers[i] < min) {
                min = numbers[i];
            }
        }

        System.out.println("Maximum value = " + max);
        System.out.println("Minimum value = " + min);

        sc.close();
    }
}
