package Interview.FunctionalInterface;

public class Main {
    public static void main(String[] args) {
        FuncInterface fc = (i, j) -> i + j;
        int result = fc.sum(10, 20);
        System.out.println("Sum: " + result);


    }
}
