package String_Learning;

public class String_replace {
    public static void main(String[] args) {
        String a = "The shit is just a shit";
        String restr = a.replace("shit","hero");
        System.out.println(restr);


        //利用正则表达式替换
        String b = "123123123abcd";
        String restr1 = b.replaceAll("\\d","蛤蛤");
        System.out.println(restr1);
    }
}
