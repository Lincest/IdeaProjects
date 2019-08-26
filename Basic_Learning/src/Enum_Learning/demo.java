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
        Constants array[]=Constants.values();
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i].getnum());
            System.out.println(array[i].getstr());

        }
    }
}
