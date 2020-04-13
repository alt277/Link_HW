package Lists;

import java.util.HashMap;
import java.util.LinkedList;

public class HashApp {
    public static void main(String[] args) {

        HashMap<Integer, LinkedList<String>> map = init();
        System.out.println(map);


        LinkedList list1= new LinkedList();
        LinkedList list2= new LinkedList();
            list1.addFirst(10);
            list1.addLast(20);
            list1.addLast(30);
            list1.addLast(40);
         System.out.println(list1);
            list2.addFirst("A");
            list2.addLast("B");
            list2.addLast("C");
            list2.addLast("D");
        map.put(1,list1);
        map.put(2,list2);
         System.out.println(map);

    }

    static HashMap<Integer, LinkedList<String>>  init() {
        HashMap<Integer, LinkedList<String>> map = new HashMap<>();
        map.put(1, new LinkedList<String>());
        map.put(2, new LinkedList<String>());

        return map;
    }

}
