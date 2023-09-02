package month08.week01.day03;

import java.util.*;

public class Day03_01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        List<Integer> list=new ArrayList<>();
        for (int i = 0; i < size; i++) {
            int n =scan.nextInt();
            if(!list.contains(n)){
                list.add(n);
            }
        }
        Collections.sort(list);

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
