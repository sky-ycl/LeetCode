package util;

public class ArrayUtil {

    public static String toString(int[] nums){
        StringBuilder builder = new StringBuilder();
        builder.append("[");
        if(nums.length==0){
            builder.append("]");
            return builder.toString();
        }
        for (int i = 0; i < nums.length; i++) {
            if(i==nums.length-1){
                builder.append(i+"]");
                break;
            }
            builder.append(i+",");
        }
        return builder.toString();
    }
}
