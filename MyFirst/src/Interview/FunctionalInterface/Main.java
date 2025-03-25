package Interview.FunctionalInterface;

public class Main {
    public static void main(String[] args) {
        FuncInterface fc = (int i, int j)-> i+j;
        int result = fc.sum(10, 20);
        System.out.println("Sum: " + result);


    }
}
