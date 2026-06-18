package day_1_task.topic_4;

import java.util.Scanner;

public class modulusOper {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter dividend: ");
        int a = sc.nextInt();

        System.out.print("Enter divisor: ");
        int b = sc.nextInt();

        int remainder = a % b;

        System.out.println("Remainder = " + remainder);

        sc.close();
    }
}
