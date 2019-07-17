package String_Learning;

public class String_contains {
    public static void main(String[] args) {
        String str = "8888 8888 8888 88B8";
        boolean bool1 = str.contains("8");
        boolean bool2 = str.contains("B");
        boolean bool3 = str.contains("h");
        System.out.println(bool1);
        System.out.println(bool2);
        System.out.println(bool3);

        //利用indexOf方法来判断
        if(str.indexOf("8")>-1){
            System.out.println("8存在");
        }
        if(str.indexOf("B")>-1){
            System.out.println("B存在");
        }

    }
}
