package Exception_Learning;

public class CharacterDeomo {
    public static void main(String[] args) {
        Character c = new Character('A');
        System.out.println(c);
        System.out.println("大写乎？"+Character.isUpperCase(c));
        System.out.println("小写乎？"+Character.isLowerCase(c));
        System.out.println("转换为小写的结果： "+Character.toUpperCase(c));

        System.out.println("字母乎？"+Character.isAlphabetic(c));
        System.out.println("数字乎？"+Character.isDigit(c));
    }
}
