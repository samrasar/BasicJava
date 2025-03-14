package MapRelated;

import java.util.HashMap;
import java.util.Map;

public class HashMapSizeCheck {

    public static void main(String[] args) {
        Student s = new Student();
        Student s1 = new Student();
        s.setId(1);
        s.setMarks(49);

        s1.setId(1);
        s1.setMarks(49);

        Map<Student, Integer> hm = new HashMap<Student, Integer>();
        hm.put(s, 11);
        hm.put(s1, 11);
        System.out.println(hm.size()); //Overridden hash code and equals method

    }

}
