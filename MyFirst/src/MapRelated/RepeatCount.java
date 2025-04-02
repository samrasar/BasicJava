package MapRelated;

import java.util.HashMap;

public class RepeatCount {
    public static void main(String[] args) {
        String input = "ABCDEDC";
        char[] charArray = input.toCharArray();
        HashMap<Character, Integer> hm = new HashMap<>();

        for (Character c : charArray) {
            if (hm.containsKey(c)) {
                hm.put(c, hm.get(c) + 1);
            } else {
                hm.put(c, 1);
            }
        }
        System.out.println(hm);

        String input1 = "THIS IS THE THIS IS NAME THE";
        String[] strArray = input1.split(" ");

        HashMap<String, Integer> hm1 = new HashMap<>();
        for (String s : strArray) {
            if (hm1.containsKey(s)) {
                hm1.put(s, hm1.get(s) + 1);
            } else {
                hm1.put(s, 1);
            }
        }
        System.out.println(hm1);
    }
}
