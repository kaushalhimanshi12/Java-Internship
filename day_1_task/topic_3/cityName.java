package day_1_task.topic_3;

import java.util.Scanner;

public class cityName {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your city name: ");
        String city = sc.nextLine();

        System.out.println("City: " + city);

        sc.close();
    }
}
