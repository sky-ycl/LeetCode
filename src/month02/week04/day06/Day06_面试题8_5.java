package month02.week04.day06;

public class Day06_面试题8_5 {
    public int multiply(int A, int B) {
        int maxNum=Math.max(A, B);
        int minNum=Math.min(A,B);
        return method(minNum,maxNum);
    }

    public int method(int minNum,int maxNum){
        if(minNum==1){
            return maxNum;
        }
        return method(--minNum,maxNum)+maxNum;
    }

    public static void main(String[] args) {
        int num = new Day06_面试题8_5().multiply(1, 4);
        System.out.println(num);
    }
}
