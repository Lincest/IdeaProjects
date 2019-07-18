package String_Learning;

public class String_stringbuffer {
    public static void main(String[] args) {
        String str = "abc";
        StringBuffer str1 = new StringBuffer("abc");
        str = str.replace("b","B");
        str1.replace(1,2,"B");
        System.out.println(str);
        System.out.println(str1);
    }
}
