package MapSetHash_Learning;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Maplearn {
    public static void main(String[] args) {
        Map map = new HashMap();

        map.put("String","字符串");
        map.put("Object",new Object());
        map.put("int",1234);
        map.put(123,"123");
        map.put(new Object(),new Object());
        map.put(null,null);

        System.out.println(map.size());

        Set set =map.keySet();//将map的键存成一个集合

        Iterator it = set.iterator();
        while(it.hasNext()){
            Object obj = it.next();
            System.out.println(obj+": "+map.get(obj));//输出键值对
        }
    }
}
