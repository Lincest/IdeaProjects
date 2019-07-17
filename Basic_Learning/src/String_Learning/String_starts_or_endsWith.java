package String_Learning;

public class String_starts_or_endsWith {
    public static void main(String[] args) {

    String fileName = "HelloJava.java";
    boolean bool1 = fileName.endsWith(".jpg");
    boolean bool2 = fileName.endsWith(".java");
    System.out.println(bool1);
    System.out.println(bool2);

    boolean bool3 = fileName.startsWith("Hello");
    boolean bool4 = fileName.startsWith("hello");
    System.out.println(bool3);
    System.out.println(bool4);
    }
}
