package day_7_task.topic_4;

import java.util.Scanner;

public class longestCommonPrefix {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of strings: ");
        int n = sc.nextInt();
        sc.nextLine();

        String[] strs = new String[n];

        System.out.println("Enter the strings:");
        for (int i = 0; i < n; i++) {
            strs[i] = sc.nextLine();
        }

        if (n == 0) {
             System.out.println("Longest Common Prefix: \"\"");

             return;
        }

        String prefix = strs[0];

        for (int i = 1; i < n; i++) {
            while (!strs[i].startsWith(prefix)) {
                prefix = prefix.substring(0, prefix.length() - 1);

                if (prefix.isEmpty()) {
                    System.out.println("Longest Common Prefix: \"\"");
                    sc.close();
                    return;
                }
            }
        }

        System.out.println("Longest Common Prefix: " + prefix);
        sc.close();
    }
}
