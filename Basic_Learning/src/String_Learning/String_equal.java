package String_Learning;

public class String_equal {
    public static void main(String[] args) {
        String name = new String("Tom");
        String dbvalue = new String("Tom");
        String dbvalueup = new String("TOM");
        System.out.println(name == dbvalue);
        //结果是false,因为==号判断的是内存的地址,name和dbvalue的内存地址
        //不相同,结果自然是false

        //判断字符串是否相等的方法
        System.out.println(name.equals(dbvalue));

        //忽略大小写的比较方法
        System.out.println(name.equalsIgnoreCase(dbvalueup));

        //但是如果使用字符串常量,直接用==比较结果是true
        String name1 = "Tom";
        String name2 = "Tom";
        System.out.println(name1==name2);
        System.out.println(name ==name2);


        //特殊情况
        String a="Hello";
        String b=new String("Java");
        String str1 = a+b;
        String str2 = "Hello" + "Java"; //相当于str2="helloJava"
        String str3 = "HelloJava";
        System.out.println("---------");
        System.out.println(str1==str2);
        System.out.println(str2==str3);
        System.out.println(str1==str3);

    }
}
