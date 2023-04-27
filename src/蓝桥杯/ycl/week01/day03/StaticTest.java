package 蓝桥杯.ycl.week01.day03;

public class StaticTest {
    private static String name;

    public static void main(String[] args) {
        StaticTest staticTest = new StaticTest();
        staticTest.show();
        staticTest.get();

    }

    public void show() {
        name = "zhangsan";

    }

    public static void get() {
        name="lisi";
        System.out.println(name);
    }
}
