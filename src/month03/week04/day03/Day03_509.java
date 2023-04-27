package month03.week04.day03;

public class Day03_509 {
    public int fib(int n) {
        if(n==0 || n==1){
            return n;
        }
        return fib(n-1)+fib(n-2);
    }

    public static void main(String[] args) {
        int res = new Day03_509().fib(4);
        System.out.println(res);
    }
}
