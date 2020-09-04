package _1_Array._01常用.算法;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Date;

public class 小数精度 {
    public static void main(String[] args) {

        //
//        完整的格式 : %[index$][标识]*[最小宽度][.精度]转换符
//
//        1.% ，占位符的其实字符，若要在占位符内部使用%，则需要写成 %%
//
//        2.[index$] ，位置索引从1开始计算，用于指定对索引相应的实参进行格式化并替换掉该占位符
//
//        3.[标识] ，用于增强格式化能力，可同时使用多个 [标识] ，但某些标识是不能同时使用的
//        3.1 - : 在最小宽度内左对齐，右边用空格补上(不可以与0一起使用)
        System.out.println(String.format("%-7d1", 100));   //100    1

//        3.2 0 : 若内容长度不足最小宽度，则在左边用0来填充(其他数字无效)
        System.out.println(String.format("%08d", 100));         //00000100

//        3.3 # : 对8进制和16进制，8进制前添加一个0,16进制前添加0x

//        3.4 + : 结果总包含一个+或-号
        System.out.println(String.format("%+d", 100));           //+100

//        3.5 空格 : 正数前加空格，负数前加-号
        System.out.println(String.format("% d", 200));           // 200
        System.out.println(String.format("% d", -200));          //-200

//        3.6 , : 只用与十进制，每3位数字间用,分隔
        System.out.println(String.format("%,d", 999999999));     //999,999,999

//        3.7 ( : 若结果为负数，则用括号括住，且不显示符号
        System.out.println(String.format("%(d", -999999));       //(999999)

//        注意:标识可以一起使用(除了 - 和 0 )
//
//        4.[最小宽度] ，用于设置格式化后的字符串最小长度，若使用 [最小宽度] 而没有设置 [标识]
//  ，那么当字符串长度小于最小宽度时，则以左边补空格的方式凑够最小宽度
//
//        5.[.精度] ，对于浮点数类型格式化使用，设置保留小数点后多少位
        System.out.println(String.format("%.2f",7777.7777));        //7777.78
        System.out.println(String.format("%.2g",7777.7777));        //7.8e+03




        double a=9.9/4;
        double b=2.0/6;
        System.out.printf("%.3f",a);  //四舍五入

        System.out.println();
        System.out.println(b);

        BigDecimal bigDecimal = new BigDecimal(String.valueOf(a));

        bigDecimal.intValue();  //返回int类型

        bigDecimal.byteValue(); //返回byte类型

        bigDecimal.doubleValue();//返回double类型

        bigDecimal.floatValue();//返回float类型

        bigDecimal.longValue();//返回long类型

        bigDecimal.setScale(1, BigDecimal.ROUND_UP);//保留1位小数,无论第二位是几都向上进1

        bigDecimal.setScale(1, BigDecimal.ROUND_DOWN);//保留1位小数,无论第二位是几,都不进1

        bigDecimal.setScale(1, BigDecimal.ROUND_HALF_DOWN);//保留1位小数,四舍五入

        bigDecimal.setScale(1, BigDecimal.ROUND_HALF_UP);//保留1位小数,四舍五入

        bigDecimal.signum();//获取数值的正负

        bigDecimal.abs();//获取绝对值

        bigDecimal.compareTo(new BigDecimal("144.2"));//与指定的数值做比较

        bigDecimal.max(new BigDecimal("133.2"));//比较两个数的最大值

        bigDecimal.min(new BigDecimal(22.2));//比较两个数的最小值

        bigDecimal.movePointLeft(2);//小数点向左移2位

        bigDecimal.movePointRight(2);//小数点向右移两位

        bigDecimal.remainder(new BigDecimal("3"));//取余

        bigDecimal.toEngineeringString();//字符串表示形式，需要指数时，则使用工程计数法

        bigDecimal.toPlainString();//不带指数字段的此BigDecimal的字符串表示形式

        bigDecimal.ulp();//返回精确到第几位

        bigDecimal.stripTrailingZeros();//数值上等于此小数，但从该表示形式移除所有尾部零的BigDecimal

        bigDecimal.add(new BigDecimal("10"));//加

        bigDecimal.subtract(new BigDecimal("30"));//减

        bigDecimal.multiply(new BigDecimal("10"));//乘

        bigDecimal.divide(new BigDecimal("40"), 3, BigDecimal.ROUND_HALF_DOWN);//除


//
//0 : 数字,如果数字不存在用0补齐
//# : 数字,如果数字不存在则显示空( )
//. : 小数分隔符
//, : 分组分隔符(例如:333,333,333)
//% : 数值*100,用%号显示(32.33%)
//$ : 在后面加上货币符号

        DecimalFormat decimalFormat = new DecimalFormat();
        decimalFormat.applyPattern("###.###");
        decimalFormat.format(12.34);   //12.34

        decimalFormat.applyPattern("000.000");
        decimalFormat.format(12.34);       //012.340

        decimalFormat.applyPattern("0.0");
        decimalFormat.format(12.34);       //12.3,保留1位小数,整数全部显示

        decimalFormat.applyPattern("#.#");
        decimalFormat.format(12.34);       //12.3,保留1位小数,整数全部显示

        decimalFormat.applyPattern("#0.000%");
        decimalFormat.format(0.3222222);   //32.222%

        decimalFormat.applyPattern("#.000$");
        decimalFormat.format(222.3222222); //222.322$


//
        //取整，返回小于目标的最大整数
        Math.floor(-1.8);  //-2
        Math.floor(1.8);   //1

//取整，返回大于目标数的最小整数
        Math.ceil(-1.8);  //-1
        Math.ceil(1.8);   //2

//四舍五入取整
        Math.round(123.345345);  //123
        Math.round(123.456234345);  //123
        Math.round(123.567678);  //124
        Math.round(-123.345345);  //-123
        Math.round(-123.456234345);  //-123
        Math.round(-123.567678);  //-124

//计算平方根
        Math.sqrt(1.21);  //1.1
        Math.sqrt(9);    //3.0
        Math.sqrt(-1.21);  //NaN

//计算立方根
        Math.cbrt(27);  //3
        Math.cbrt(1.331);  //1.1
        Math.cbrt(-1.331);  //-1.1

//返回欧拉数e的n次幂
        Math.exp(3);

//计算乘方,下面是计算3的2次方
        Math.pow(3,2);

//计算自然对数
        Math.log(2);

//计算绝对值
        Math.abs(10);  //10
        Math.abs(-10);  //10

//计算最大值
        Math.max(2.3,4.5);  //4.5

//计算最小值
        Math.min(2.3,4.5);  //2.3

//返回一个伪随机数，该数大于等于0.0并且小于1.0(不等于1.0)
        Math.random();

//返回其值最接近参数并且是整数的 double 值。如果两个整数的 double 值都同样接近，那么结果取偶数
        Math.rint(66.333);  //66
        Math.rint(66.666);  //67
        Math.rint(66.500);  //66
        Math.rint(67.500);  //68




//        注意:保留小数后几位建议用 %f, (因为 %g 格式化出来的是科学计数法)
//
//        6.转换符 ，用于指定格式化的样式，和限制对应入参的数据类型
//        6.1 %b : 布尔类型，只要实参为非false的布尔类型，均格式化为字符串true，否则为字符串false
//
//        6.2 %d : 整数
//
//        6.3 %x : 16进制
//
//        6.4 %0 : 8进制
//
//        6.5 %n : 换行符
//
//        6.6 %f : 浮点型,十进制,显示9位有效数字,自动四舍五入
        System.out.println(String.format("%f",999000.9999999999999));   //999001.000000

//        6.7 %g : 浮点型,十进制,显示6位有效数字,自动四舍五入
        System.out.println(String.format("%g",999880.9999999999999));   //999881
        System.out.println(String.format("%g",9880.9999999999999));     //9881.00

//        7.日期格式化:
//    %tc : 日期格式化,星期六 十月 27 14:21:20 CST 2007
//                %tF : 2007-10-27
//                %tD : 10/27/07
//                %tr : 02:25:51 下午
//                %tT : 14:28:16
//                %tR : 14:28
//                %tb : 月份简称
//                %tB : 月份全称
//                %ta : 星期简称
//                %tA : 星期全称
//                %tC : 年前两位（不足两位补零）
//    %ty : 年后两位（不足两位补零）
//    %tj : 当年的第几天
//                %tm : 月份（不足两位补零）
//    %td : 日期（不足两位补零）
//    %te : 日期（不足两位不补零）
//    %tH : 24小时制的小时（不足两位补零）
//    %tk : 24小时制的小时（不足两位不补零）
//    %tI : 12小时制的小时（不足两位补零）
//    %tl : 12小时制的小时（不足两位不补零）
//    %tM : 分钟（不足两位补零）
//    %tS : 秒（不足两位补零）
//    %tL : 毫秒（不足三位补零）
//    %tN : 毫秒（不足9位补零）
//    %tp : 小写字母的上午或下午标记，如中文为“下午”，英文为pm
//                %tz : 相对于GMT的时区偏移量，如+0800
//                %tZ : 时区缩写，如CST
//                %ts : 自1970-1-1 00:00:00起经过的秒数
//                %tQ : 自1970-1-1 00:00:00起经过的豪秒

        System.out.println(String.format("%tF %<tT", new Date()));  //2016-11-13 15:18:58

//    %< : 用于格式化前一个转换符所描述的参数
        int num = 1000;
        String str = String.format("%d %<,d", num);//(根据, 分割数字)
        // 结果"1000 1,000
    }

//

}
