package DAY_4;

import java.util.HashMap;
import java.util.Scanner;

public class Wordcount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the sentence: ");
        String str = sc.nextLine();
        str = str.toLowerCase();
        str=str.replaceAll("[^a-z]"," " );
        String[] words = str.trim().split("\\s+");
        HashMap<String,Integer> map = new HashMap<>();

        for(String word: words){
            if(map.containsKey(word)){
                map.put(word, map.get(word)+1);
            }else{
                map.put(word, 1);
            }
        }
        int wordCount = words.length;
        System.out.println("Number of words in the string: " + wordCount);
        sc.close();
    }
    
}
