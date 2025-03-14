package ImmutableCheck;

public final class ImmutableClass {
    private final int id;
    private final String name;

    public int getId() {
        return id;
    }

    // No Setter method to set
    public String getName() {
        return name;
    }

    //Public constructor to set values
    public ImmutableClass(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public static void main(String args[]) {
        ImmutableClass ic = new ImmutableClass(1, "Samrat");
        //ic.id=5; // if u remove final we can update the value
        System.out.println(ic.name);

    }
}
