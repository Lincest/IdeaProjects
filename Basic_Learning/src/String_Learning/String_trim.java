package String_Learning;

public class String_trim {
    public static void main(String[] args) {
        String str = "           a   b  c          ";
        System.out.println(str);

        //trim方法去除首尾空格
        System.out.println(str.trim());

        //利用正则表达式去除所有空格
        System.out.println(str.replaceAll("\\s",""));
    }

}
