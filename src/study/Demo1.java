package study;


import java.util.ArrayList;
import java.util.List;

public class Demo1 {
    private static final List<Integer> list=new ArrayList<>();

    public static boolean show(String str,String str1){
        char []s1=str.toCharArray();
        char []s2=str1.toCharArray();
        int i=0;
        int j=0;
        while (i<str.length()&&j<str1.length()){
            if(s1[i]==s2[j]){
                i++;
                j++;
            }else{
                i=i-j+1;
                j=0;
            }
        }
        if(j==str1.length()){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args) {
        String str="bcabcabcdef";
        String str1="abcd";
        boolean res=show(str,str1);
        System.out.println(res);
    }
}
