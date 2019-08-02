package MapSetHash_Learning;

public class Person_Set implements Comparable{
    int id;
    int age;
    String name;

    @Override
    public String toString() {
        return "Person_Set{" +
                "id=" + id +
                ", age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
    public Person_Set(int id, int age, String name) {
        this.id = id;
        this.age = age;
        this.name = name;
    }

    @Override
    public int compareTo(Object o) {
        Person_Set p;
        if(o instanceof Person_Set){
            p = (Person_Set)o;
        }else{
            return -1;
        }
        int diff = this.id - p.id;  //按id排序
        int diff1 = this.age - p.age;   //按年age排序
        if (diff1 <= 0) {
            return -1;
        }
        return 1;
    }
}
