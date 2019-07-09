package String_Learning;

public class Basic_String {
    public static void main(String[] args) {
        String a = "锄禾日当午，老王日了狗";
        System.out.println(a);
        String b = "锄禾日当午",c = "老王日了狗";
        System.out.println(b);
        System.out.println(c);
    //以下为利用构造方法直接构造字符串
        String d = new String("锄禾日当午，老王日狗狗");
        System.out.println(d);


        char charArray[] = new char[]{'老','王','没','有','日','狗'};
        String a1 = new String(charArray);
        String a2 = new String(charArray,0,2),a3 = new String(charArray,3,3);
        System.out.println(a1);
        System.out.print(a2);
        System.out.println(a3);
    }
}
