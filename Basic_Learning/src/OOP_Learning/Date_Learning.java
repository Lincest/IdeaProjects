package OOP_Learning;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Date_Learning {

    public static void main(String[] args) {
//        Date date = new Date();
//        long time = 1564726163326L;
//        Date date1 = new Date(time); //1970年0点0分至今的时间
//        System.out.println(date);
//        long value = date.getTime();//时间起点到现在经历的毫秒数
//        System.out.println(""+value);
//        System.out.println(date1);
        Date date = new Date();
        DateFormat df;
        df = new SimpleDateFormat("y-M-d H:m:s");
        System.out.println(df.format(date));

    }


}
