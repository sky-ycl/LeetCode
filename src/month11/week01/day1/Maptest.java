package month11.week01.day1;

public class Maptest {
    public static void main(String[] args) {
       int arr[]=new int[9];
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < i; j++) {
                arr[i]++;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+"  ");
        }
    }
}
