package MapSetHash_Learning;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class IteratorLearn {
    public static void main(String[] args) {
        Collection c = new ArrayList();
        c.add(1);
        c.add(2);
        c.add(3);
        Iterator it = c.iterator();
        while(it.hasNext()){
            Object obj = it.next();
            System.out.println(obj);
        }
    }
}
