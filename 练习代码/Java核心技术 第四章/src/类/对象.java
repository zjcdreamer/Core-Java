package 类;

import java.time.LocalDate;
import java.util.Date;

public class 对象 {
    public static void main(String[] args) {
        System.out.println("Date类型："+new Date());
        System.out.println("LocalDate类型："+LocalDate.now());
        LocalDate newYear = LocalDate.of(2020,4,18);
        int year = newYear.getYear();
        int month = newYear.getMonthValue();
        int day = newYear.getDayOfMonth();
        System.out.println("年："+year);
        System.out.println("月："+month);
        System.out.println("日："+day);
        System.out.println("==================未来===========================");
        LocalDate futureDate = newYear.plusDays(100);
        int fyear = futureDate.getYear();
        int fmonth = futureDate.getMonthValue();
        int fday = futureDate.getDayOfMonth();
        System.out.println("年："+fyear);
        System.out.println("月："+fmonth);
        System.out.println("日："+fday);
    }
}
