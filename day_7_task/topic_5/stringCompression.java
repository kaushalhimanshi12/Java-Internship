package day_7_task.topic_5;

import java.util.Scanner;

public class stringCompression {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        String compressed = "";
        int count = 1;

        for (int i = 0; i < str.length(); i++) {

            if (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
                count++;
            } else {
                 compressed += str.charAt(i);
                compressed += count;
                count = 1;
            }
        }

        if (compressed.length() < str.length()) {
            System.out.println("Compressed String: " + compressed);
        } else {
            System.out.println("Original String: " + str);
        }

        sc.close();
    }
}
