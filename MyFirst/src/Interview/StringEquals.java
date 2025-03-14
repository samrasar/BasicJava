package Interview;

public class StringEquals {
    public static void main(String[] args) {
        String a = "sam"; // can't be changed immutable
        String b = "sam";
        String c = "Sam";

        System.out.println(a == b);
        System.out.println("a.equals(b) >" + a.equals(b));
        System.out.println(a == c);
        System.out.println("a.equals(c) >" + a.equals(c));
    }
}
