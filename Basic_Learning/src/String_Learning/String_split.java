package String_Learning;

public class String_split {
    public static void main(String[] args) {
        String a = "王八 卖 豆腐";
        String b = "一斤,一块,八";
        String afa[] = a.split(" ");
        String bfb[] = b.split(",");
        for (String s : afa) {
            System.out.print(s+"-");
        }
        System.out.println();
        for (String s : bfb) {
            System.out.print(s+"-");
        }
        System.out.println();
        //限制分割次数
        String[] firstArray=a.split(" ",2);
        for (String s : firstArray) {
            System.out.print(s+"-");
        }
    }
}
