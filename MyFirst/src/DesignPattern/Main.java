package DesignPattern;

public class Main {
    public static void main(String[] args) {
        // Get the singleton instance
        Singleton singleton = Singleton.getObject();
        // Set type
        singleton.setType("Car");
        // Get and print type
        System.out.println(singleton.getType());
        // Get the singleton instance
        Singleton singleton1 = Singleton.getObject();
        // Set type
        singleton1.setType("Bike");
        // Get and print type
        System.out.println(singleton1.getType());
        /*
        Both values belong to the same Singleton instance.You’re not creating multiple objects—you
        're just updating the type field in the instance of the class.
        This confirms that singleton and singleton1 are the same instance.
        */
        System.out.println(singleton == singleton1);
    }
}