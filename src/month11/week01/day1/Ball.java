package month11.week01.day1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ball implements Comparable<Integer>{
    int lowLimit;//表示球开始的编号
    int highLimit;//表示球结束的编号
    int n=highLimit-lowLimit+1;//n表示球的数量
    List<Integer> box;
    public Ball(int lowLimit, int highLimit) {
        this.lowLimit = lowLimit;
        this.highLimit = highLimit;
    }
    public void test(){
        box=new ArrayList<>();
        for(int i=lowLimit;i<=highLimit;i++){
            int a=i/10;
            int b=i%10;
            int ballNo=a+b;
            box.add(ballNo);
        }
            Collections.sort(box);
            System.out.print(box+"  ");

    }
    public static void main(String[] args) {
        new Ball(1,12).test();
    }

    @Override
    public int compareTo(Integer o) {
        return 0;
    }
}
