package Enum_Learning;


public class demo {
    //使用implement的方法
    public static void doit(int c){
        switch(c){
            case Seasons.SPRING:
                System.out.println("doit():春天");
                break;
            case Seasons.SUMMER:
                System.out.println("doit():夏天");
                break;
        }
    }

    //使用枚举的方法
    public static void doit2(Seasons2 s){
        switch(s){
            case SPRING:
                System.out.println("春天");
                break;

            case SUMMER:
                System.out.println("夏天");
                break;
        }
    }



    public static void main(String[] args) {
        Constants c1=Constants.Constants_A;
        Constants c2=Constants.valueOf("Constants_A");
        System.out.println(c1==c2);
    }
}
