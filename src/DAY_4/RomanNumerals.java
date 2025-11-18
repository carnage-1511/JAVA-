package DAY_4;


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RomanNumerals {

    public static int romanToInt(String s) {
        // Mapping of Roman numerals to values
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int total = 0;

        for (int i = 0; i < s.length(); i++) {
            int current = map.get(s.charAt(i));

            // If next numeral is larger, subtract current
            if (i + 1 < s.length() && current < map.get(s.charAt(i + 1))) {
                total -= current;
            } else {
                total += current;
            }
        }

        return total;
    }

 public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String roman = "";

        // Prefer command-line argument if provided
        if (args != null && args.length > 0 && args[0] != null && !args[0].isEmpty()) {
            roman = args[0].trim();
        } else {
            System.out.print("Enter Roman numeral: ");
            if (sc.hasNextLine()) {
                roman = sc.nextLine().trim();
            }
        }

        sc.close();

        if (roman == null || roman.isEmpty()) {
            System.out.println("No Roman numeral provided. Usage: java -cp bin DAY_4.RomanNumerals [ROMAN]");
            return;
        }

        roman = roman.toUpperCase(); // normalize

        int value = romanToInt(roman);
        System.out.println(value);
    }
}


