package String_Learning;

public class String_Convert {
    public static void main(String[] args) {
        //显式转换
        /*String strint = String.valueOf(126);
        String strLong = String.valueOf(126L);
        String strDouble = String.valueOf(126.123456);
        System.out.println(strint);
        System.out.println(strLong);
        System.out.println(strDouble);*/

        System.out.println("--------------");
        //隐式转换
        String a = "1"+2+3;
        String b = 1+2+"3"+4;
        String c = "1"+(2+3+4);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
