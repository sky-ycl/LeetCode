package month03.week04.day03;

//爬楼梯
public class Day03_70 {
    public int climbStairs(int n) {
        if(n<3){
            return n;
        }
        int a=1,b=2,c=0;
        for(int i=2;i<n;i++){
            c=a+b;
            a=b;
            b=c;
        }
        return c;
    }
}
