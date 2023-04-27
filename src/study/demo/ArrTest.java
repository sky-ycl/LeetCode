package study.demo;

import org.junit.Test;

public class ArrTest {
    @Test
    public void test(){
        int []arr={};
        System.out.println(ArrTest.show(null));
    }
    public static String show(int []arr){
        if(arr==null){
            return null;
        }else{
            if(arr.length==0){
                return "[]";
            }else{
                int val=0;
                int val1=arr.length-1;
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("[");
                while(true){
                    stringBuilder.append(arr[val]);
                    if(val==val1){
                       return stringBuilder.append("]").toString();
                    }
                    stringBuilder.append(",");
                    val++;
                }
            }
        }
    }
}
