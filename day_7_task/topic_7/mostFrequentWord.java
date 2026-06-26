package day_7_task.topic_7;

import java.util.HashMap;
import java.util.Scanner;

public class mostFrequentWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a paragraph:");
        String paragraph = sc.nextLine();

        // Remove commas and periods, convert to lowercase
        paragraph = paragraph.replace(",", "")
                             .replace(".", "")
                             .toLowerCase();

        String[] words = paragraph.split("\\s+");

        HashMap<String, Integer> map = new HashMap<>();

        for (String word : words) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }

        String frequentWord = "";
        int maxCount = 0;

        for (String word : map.keySet()) {
            if (map.get(word) > maxCount) {
                maxCount = map.get(word);
                frequentWord = word;
            }
        }

        System.out.println("Most Frequent Word: " + frequentWord);
        System.out.println("Count: " + maxCount);

        sc.close();
    }
}

