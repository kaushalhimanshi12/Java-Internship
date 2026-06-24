package day_5_task.task_3;

import java.util.Scanner;

public class evenOdd {
    public static String checkEvenOdd(int num) {
        if (num % 2 == 0) {
            return "Even";
        } else {
            return "Odd";
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        String result = checkEvenOdd(num);

        System.out.println("The number is " + result);

        sc.close();
    }
}
