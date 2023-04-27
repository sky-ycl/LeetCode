package month01.week05.day01;

public class Day01_744 {
    public char nextGreatestLetter(char[] letters, char target) {
        int min='z'-'a';
        int val;
        int index=0;
        for (int i = 0; i < letters.length; i++) {
            val=letters[i]-target;
            if(val>0){
                if(val<min){
                    min=val;
                    index=i;
                }
            }
        }
        return letters[index];
    }
}
