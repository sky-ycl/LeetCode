package month11.week01.day1;

public class Add {
    public static void main(String[] args) {
        int num[]=new int[]{2,7,11,15};
        int target=13;
        for (int i = 0; i < num.length; i++) {
            for(int j=num.length-1;j>i;j--){
                if(i<j && num[i]+num[j]==target){
                    System.out.println(i+"  "+j);
                }else{
                    continue;
                }
            }
        }
    }
}
