package day_1_task.topic_3;

import java.util.Scanner;

public class msg {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.println("Welcome, " + name + "!");

        sc.close();
    }
}
