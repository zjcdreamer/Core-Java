package 大数值;

import java.math.BigInteger;

public class 大数值 {
    public static void main(String[] args) {
        BigInteger bigInteger = BigInteger.valueOf(20);
        System.out.println(bigInteger); //输出20
        System.out.println(bigInteger.equals(20)); //输出false
    }
}
