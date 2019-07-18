package OOP_Learning;

public class demo{
    public static void main(String[] args) {
        Object[] arr = new Object[4];
        arr[0] = new Object();
        arr[1] = new String("jell");
        arr[2] = new demo();
        arr[3] = new Integer(10);
        for (Object o : arr) {
            System.out.println(o);
        }
    }


    @Override
    public String toString() {
        return "我是demo";
    }

}