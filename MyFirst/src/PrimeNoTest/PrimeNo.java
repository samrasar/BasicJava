package PrimeNoTest;

public class PrimeNo {

    public static void main(String[] args) {
        int range = 100;
        for (int i = 2; i <= range; i++) {
            primeCheck(i);
        }
    }

    static void primeCheck(int n) {

        boolean flag = true;
        for (int x = 2; x <= n / 2; x++) {
            if (n % 2 == 0 || n % x == 0) {

                flag = false;
                break;
            }
        }
        if (flag) {
            System.out.println("prime" + n);
        }
    }

};