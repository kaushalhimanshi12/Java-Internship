package day_7_task.topic_3;

import java.util.Scanner;

public class firstNonRepeatingChar {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        int index = -1;

        for (int i = 0; i < str.length(); i++) {
            int count = 0;

            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    count++;
                }
            }

            if (count == 1) {
                index = i;
                break;
            }
        }

        System.out.println("Index: " + index);

        sc.close();
    }

}
