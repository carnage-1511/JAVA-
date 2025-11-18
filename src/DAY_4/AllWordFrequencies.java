package DAY_4;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AllWordFrequencies {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a sentence:");
        String sentence = sc.nextLine().toLowerCase();
        sc.close();
        sentence =sentence.replaceAll("[^a-z]"," " );

        String[] words = sentence.split("\\s+");

        Map<String, Integer> freq = new HashMap<>();

        for (String w : words) {
            freq.put(w, freq.getOrDefault(w, 0) + 1);
        }

        System.out.println("Word Frequencies:");
        for (String w : freq.keySet()) {
            System.out.println(w + ": " + freq.get(w));
        }
    }
}

