package month02.week04.day06;

/*求 1+2+...+n ，要求不能使用乘除法、for、while、if、else、switch、case等关键字及条件判断语句（A?B:C）。*/
public class Day06_Offer64 {
    public int sumNums(int n) {
        if(n==0){
            return 0;
        }
        return sumNums(n-1)+n;
    }

    public static void main(String[] args) {
        int num = new Day06_Offer64().sumNums(9);
        System.out.println(num);
        int min = Math.min(1, 1);
        System.out.println(min);
    }
}
