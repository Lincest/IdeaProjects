import java.util.Scanner;

public class acm_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        while(sc.hasNext()) {
            n=sc.nextInt();
            String A = sc.next();
            String B = sc.next();
            String C;
            int suma = 0, sumb = 0, sum = 0;
            for (int i = 0; i < n; i++) {
                C = sc.next();
                for (int j = 0; j < C.length(); ++j) {
                    if (C.charAt(j) == A.charAt(j)) suma++;
                    if (C.charAt(j) == B.charAt(j)) sumb++;
                }
                sum = Math.max(suma, sumb);
                System.out.println(sum);
                suma = 0;
                sumb = 0;
                sum = 0;
            }
        }
    }
}
