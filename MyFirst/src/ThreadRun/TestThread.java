package ThreadRun;

import java.util.Arrays;
import java.util.List;

public class TestThread {

        public static void main(String[] args) {
            Thread t1 = new Thread(new Runnable() {
                @Override
                public void run() {
                    TestThread t = new TestThread();
                    t.myMeth();
                }
            });
            Thread t2 = new Thread(new Runnable() {
                @Override
                public void run() {
                    TestThread t = new TestThread();
                    t.myMeth();
                }
            });
            t1.start();
            t2.start();
        }

        public void myMeth() {
            List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6);
            for (Integer i : list) {
                System.out.println("List element : "+i);
            }
        }
    }


// Note : Find the 5th max salary from employee table
// Select Distinct salary
// from Employee
//order by salary desc Limit 1 offset 4
