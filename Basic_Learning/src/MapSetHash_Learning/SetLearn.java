package MapSetHash_Learning;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class SetLearn {
    public static void main(String[] args) {
//        Set set = new TreeSet();
//        Person_Set p1 = new Person_Set(1 ,18,"mike");
//        Person_Set p2 = new Person_Set(2,22,"amy");
//        Person_Set p3 = new Person_Set(3,20,"john");
//        set.add(p1);
//        set.add(p2);
//        set.add(p3);
//        System.out.println("set大小： "+set.size());
//
//        Iterator it = set.iterator();
//        while (it.hasNext()) {
//            System.out.println(it.next());
//        }
        Set set = new HashSet();
        Person_HashSet p2 = new Person_HashSet(1,"tian");
        Person_HashSet p1 = new Person_HashSet(2,"mike");
        set.add(p1);
        set.add(p2);
        p1.id = 3;
        set.add(p1);
        Person_HashSet p3 = new Person_HashSet(2,"mike");

        Iterator it = set.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
