package String_Learning;

public class String_toCharArray {
    public static void main(String[] args) {
        String str = "这是一个字符串";
        char[] ch = str.toCharArray();
        for (char c : ch) {
            System.out.println(c);
        }

    }
}
