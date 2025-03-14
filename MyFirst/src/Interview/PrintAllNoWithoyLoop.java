package Interview;

public class PrintAllNoWithoyLoop {
    public static void main(String[] args) {
        PrintAllNoWithoyLoop.printNos(5, 1);
    }

    public static void printNos(int n, int start) {
        System.out.println(start);
        if (n == start) {
            return;
        }
        start++;
        PrintAllNoWithoyLoop.printNos(n, start);
    }

}
