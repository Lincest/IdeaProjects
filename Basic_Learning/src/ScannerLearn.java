import java.util.Scanner;

public class ScannerLearn {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入名字：");
        String name = scanner.nextLine();
        System.out.println("请输入年龄：");
        int age = scanner.nextInt();
        System.out.println("################");
        System.out.println(name);
        System.out.println(age);
    }
}
