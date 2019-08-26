package OOP_Learning;

public class test {
    public static void main(String[] args) {
        {
            for(int input=10000000;input<99999999;input++){
                    int v7 = 1;
                    int v8 = 10000000;
                    int v3 = 1;
                    if (Math.abs(input / 1000 % 100 - 80) == 3 && input % 1000 % 927 == 0) {
                        int v5 = 0;
                        while (v5 < 4) {

                            if (input / v7 % 10 != input / v8 % 10) {

                                v3 = 0;
                            }
                            v7 *= 10;
                            v8 /= 10;
                            v5++;
                        }
                        if (v3 != 1) {
                            continue;
                        }
                        if (v3 == 1) {
                            System.out.println(input);
                        }
                    }
                }}
        }
}
