package TrickyDemo;

public class MyDemo1 {
    public static void main(String[] args) {
        /* String str="2a2b3c";
        output-aabbccc*/

        String str = "2a2b3c";
        System.out.println(str);
        StringBuilder result = new StringBuilder();

        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))){
               count = str.charAt(i) - '0';   // convert char digit to int
                for (int j = 0; j < count; j++) {
                    result.append(str.charAt(i+1));
                }
            }
        }
        System.out.println(result);
    }
}
