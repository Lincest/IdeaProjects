package String_Learning;

import java.sql.SQLOutput;
import java.util.Date;

public class String_format {
    public static void main(String[] args) {
        Date date = new Date();
        String str = String.format("%tF", date);
        String year = String.format("%tY",date);
        String month = String.format("%tB",date);
        String day = String.format("%td",date);
        String hour = String.format("%tH",date);
        String minute = String.format("%tM",date);
        String second = String.format("%tS",date);
//分别输出格式化后的时间,年月日时分秒
        System.out.println(date);
        System.out.println(str);
        System.out.println(year);
        System.out.println(month);
        System.out.println(day);
        System.out.println(hour);
        System.out.println(minute);
        System.out.println(second);
    }
}
