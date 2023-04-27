package month03.week04.day03;

import java.util.Calendar;
import java.util.Scanner;

public class Day03_392 {
    public boolean isSubsequence(String s, String t) {
        if( s==null ||s.length()>t.length()){
            return false;
        }
        if(s.length()==0){
            return true;
        }
        int index = 0;
        char c = s.charAt(index);
        for (int i = 0; i < t.length(); i++) {
            if (t.charAt(i) == c) {
                index++;
                if (index > s.length()-1) {
                    return true;
                }
                c = s.charAt(index);
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int hour = scan.nextInt();
        int minute = scan.nextInt();
        int addMinute = scan.nextInt();
        Calendar instance = Calendar.getInstance();
        instance.set(2023,3-1,28,hour,minute);
        instance.add(Calendar.MINUTE,addMinute);
        System.out.println(instance.get(Calendar.HOUR_OF_DAY));
        System.out.println(instance.get(Calendar.MINUTE));
    }
}
