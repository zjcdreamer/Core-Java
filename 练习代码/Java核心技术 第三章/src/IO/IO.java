package IO;

import java.io.Console;
import java.lang.*;
import java.util.Date;
import java.util.Scanner;

public class IO {
    public static void main(String[] args) {
        int x = 1;
        float y=1.5f;
        //%d表示x是一个整数，%f表示y是一个浮点数
        System.out.printf("整数 x：%d %n浮点数 y：%f \n",x,y);
        System.out.printf("%tc\n", new Date()); //完整时间
        System.out.printf("%tD\n", new Date()); //美国格式时间
        System.out.printf("%tT\n", new Date()); //24小时时间
    }
}
