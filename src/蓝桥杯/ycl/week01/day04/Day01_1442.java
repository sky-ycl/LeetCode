package 蓝桥杯.ycl.week01.day04;

public class Day01_1442 {
    public static void main(String[] args) {
        int sum=0;
        for(int i=1;i<=2019;i++){
            if(isLegal(i)){
                sum+=i;
            }
        }
        System.out.println(sum);
    }

    public static boolean isLegal(int num){
        while(num>0){
            if(num%10==0 || num%10==2 || num%10==1 || num%10==9){
                return true;
            }
            num/=10;
        }
        return false;
    }
}
