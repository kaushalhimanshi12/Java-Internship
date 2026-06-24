package day_6_task.task_5;

import java.util.Scanner;

public class userProfileGenerator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input Name
        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        // Input Email
        System.out.print("Enter Email: ");
        String email = sc.nextLine();

        // Generate Username
        String username = name.toLowerCase().replace(" ", "") + "@user";

        // Display Profile
        System.out.println("\n----- USER PROFILE -----");
        System.out.println("Name     : " + name);
        System.out.println("Email    : " + email);
        System.out.println("Username : " + username);

        sc.close();
    }
}
