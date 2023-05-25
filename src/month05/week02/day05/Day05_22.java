package month05.week02.day05;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Day05_22 {
    private List<String> list=new LinkedList<>();
    public List<String> generateParenthesis(int n) {
        StringBuilder s = new StringBuilder("(");
        backTrack(n,1,0,s);
        return list;
    }

    public void backTrack(int n,int leftCount,int rightCount,StringBuilder s){//leftCount表示左括号数量  rightCount表示右括号数量
        if(leftCount==n && rightCount==n){
            if(isLegal(s.toString())){
                list.add(new String(s));
            }
        }
        if(leftCount>n || rightCount >n){
            return;
        }
        for (int i = 0; i < 2; i++) {
            if(i==0){
                s.append("(");
                leftCount++;
            }else {
                s.append(")");
                rightCount++;
            }
            backTrack(n,leftCount,rightCount,s);
            if(i==0){
                leftCount--;
            }else{
                rightCount--;
            }
            s.deleteCharAt(s.length()-1);
        }

    }
    public boolean isLegal(String s){
        //长度为奇数的话
        if(s.length()%2!=0 || s.charAt(0)==')'){
            return false;
        }
        Queue<Character> queue=new LinkedList<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(c=='('){
                queue.offer(c);
            } else if(!queue.isEmpty() && c==')'){
                queue.poll();
            } else if(queue.isEmpty() && c==')'){
                return false;
            }
        }
        return queue.isEmpty();
    }

    public static void main(String[] args) {
        /*boolean res = new Day05_22().isLegal("(()())");
        System.out.println(res);*/
        List<String> list = new Day05_22().generateParenthesis(8);
        System.out.println(list);
    }
}
