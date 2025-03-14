package CompareToTest;

import java.util.ArrayList;

public class CompareToTestMAin {

    public static void main(String[] args) {
        ArrayList<Student> al = new ArrayList<Student>();
        al.add(new Student("DVC", 10));
        al.add(new Student("DFC", 30));
        al.add(new Student("VFC", 20));
        al.add(new Student("QSC", 50));

        //Use wrapper class to use compareTo else impl comparable interface
        al.sort((Student s1, Student s2) -> s1.getAge().compareTo(s2.getAge()));
        System.out.println(al);
        al.sort((Student s1, Student s2) -> s1.getName().compareTo(s2.getName()));
        System.out.println(al);
    }
}
