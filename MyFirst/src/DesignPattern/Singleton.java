package DesignPattern;

public class Singleton {
    private static Singleton obj; // Static instance
    private String type;

    // Private constructor prevents instantiation from outside
    private Singleton() {}

    // Public method to provide global access to the instance
    public static Singleton getObject() {
        if (obj == null) {
            obj = new Singleton();
        }
        return obj;
    }

    // Getter and Setter for 'type'
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}