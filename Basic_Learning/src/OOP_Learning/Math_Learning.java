package OOP_Learning;

public class Math_Learning {
    public static void main(String[] args) {
        System.out.println(Math.PI);

        //三角函数
        System.out.println(Math.sin(Math.PI/2));
        System.out.println(Math.cos(0));

        //指数运算
        System.out.println("e^2:"+Math.exp(2));
        System.out.println("e为底2的对数ln2"+Math.log(2));
        System.out.println("10为底2的对数"+Math.log10(2));
        System.out.println("8的立方根"+Math.cbrt(8));
        System.out.println("4的平方根"+Math.sqrt(4));
        System.out.println("2的五次方"+Math.pow(2,5));

        //比较
        System.out.println("4和8较大的"+Math.max(4,8));

        //四舍五入
        System.out.println(Math.round(2.5));
        //向下取整
        System.out.println(Math.floor(2.5));
        //round(x) = floor(x+0.5)完全等价 故计算负数时候-15.5这样round会出15

        System.out.println();


    }
}
