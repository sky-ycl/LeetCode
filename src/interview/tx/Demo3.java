package interview.tx;

import java.util.Scanner;

public class Demo3 {
    public static void main(String[] args) {
        double firsthigh;
        int n;
        Scanner in=new Scanner(System.in);//从键盘中输入两个数据
        System.out.println("请输入从多少米落下:");
        firsthigh=in.nextDouble();
        System.out.println("请输入第几次落下:");
        n=in.nextInt();
        System.out.println("从"+firsthigh+"m第"+n+"次落地经过的距离"+sum(n,firsthigh)+"m");
        System.out.println("从"+firsthigh+"m第"+n+"次反弹高度"+high(n,firsthigh)+"m");
    }
    public static double sum(int n,double firsthigh)
    {
        double sum=firsthigh;
        for(int i=0;i<n-1;i++)
        {
            sum+=firsthigh/Math.pow(2,i);//Math.pow(底数,几次方)
        }
        return sum;
    }
    public static double high(int n,double firsthigh)
    {
        return firsthigh/Math.pow(2,n);
    }

}
