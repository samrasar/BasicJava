package MethodOverLoading;

public class MyClass {
    public void getData(int a, String b) {
        System.out.println("getData1");
    }

    public void getData(String a, int b) {
        System.out.println("getData2");
    }

    private void getData(String a, String b) {
        System.out.println("getData3");
    }

    public void getData1(String a, int b, int c) throws Exception {
        System.out.println("getData4");
    }

    //Not dependent on return type
    public String getData1(String a, int b){
        System.out.println("getData2");
        return null;
    }

    /*
    //Different return type
    private void calc(int a, int b) {
        System.out.println(a + b);
    }

    private int calc(int a, int b) {
        return 0;
    }*/

}
