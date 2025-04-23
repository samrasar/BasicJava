package MapRelated;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MostRepeated {
    public static void main(String[] args) {
        String input = "apple banana apple orange banana apple";
        Map<String, Long> hm = Arrays.stream(input.split(" "))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        System.out.println(hm);
        // Find max frequency word
        String maxWord = "";
        Long maxCount = 0L;
        for (String s : hm.keySet()) {
            if (hm.get(s) > maxCount) {
                maxCount = hm.get(s);
                maxWord = s;
            }
        }
        System.out.println(maxWord + ": is the most repeated word > Count:" + hm.get(maxWord));

        String s2 = "aabbbcccffffhgggggggh";
        Map<Character, Long> hm2 = s2.chars().mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(hm2);

        String maxChar = "";
        Long maxvalue = 0L;
        for (Character c : hm2.keySet()) {
            if (hm2.get(c) > maxvalue) {
                maxvalue = hm2.get(c);
                maxChar = c.toString();
            }
        }
        System.out.println(maxChar + " : is the max frequency and count : " + hm2.get(maxvalue));
    }
}
