package study.lambda;

import org.junit.Test;

import java.util.Comparator;

public class LambdaTest1 {
    public static void main(String[] args) {
        Runnable runnable = new Runnable(){
            @Override
            public void run() {
                System.out.println("hello word");
            }
        };
        runnable.run();
        Runnable runnable1=()-> System.out.println("hello word1");
        runnable1.run();
        System.out.println(runnable.getClass());
    }

    @Test
    public void test1(){
        Comparator<Integer> comparator = new Comparator<>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return Integer.compare(o1,o2);
            }

            @Override
            public boolean equals(Object obj) {
                return false;
            }
        };
        System.out.println(comparator.compare(11, 21));
        System.out.println("***************");

        Comparator<Integer> comparator1=(Integer o1,Integer o2)->Integer.compare(o1,o2);
        System.out.println(comparator1.compare(11, 12));
    }
}
