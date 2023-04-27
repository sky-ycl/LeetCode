package 蓝桥杯.ycl.week01.day03;

import java.math.BigDecimal;
import java.math.BigInteger;

public class Test {
    public static void main(String[] args) {
        BigInteger a = new BigInteger("123456789") ;	// 声明BigInteger对象但是参数是字符串
        BigInteger b =BigInteger.valueOf(123456789) ;	// 声明BigInteger对象参数是int和log
        // 保存用户输入的数字
        double num = 1211.31354645;
        // 使用输入的数字创建BigDecimal对象
        BigDecimal bd = new BigDecimal(num);
        System.out.println("除法操作结果(保留 2 位小数)：" + bd.divide(new BigDecimal(3.14), 2, BigDecimal.ROUND_CEILING));
    }
}
