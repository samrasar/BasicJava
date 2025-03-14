package MapRelated;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class HashTreeMap {

    public static void main(String[] args) {
        Map<Integer, Integer> hm = new HashMap<Integer, Integer>();

        hm.put(1, 555);
        hm.put(1, 445);
        hm.put(1, 446);
        hm.put(1, 447);
        hm.put(1, 448);
        hm.put(1, 558);

        System.out.println(hm.get(1));

        Map<Integer, Integer> tm = new TreeMap<>();
        tm.put(1, 555);
        tm.put(4, 445);
        tm.put(2, 446);
        tm.put(3, 447);
        tm.put(6, 448);
        tm.put(5, 558);
        System.out.println("TreeMap>" + tm);

    }
}
