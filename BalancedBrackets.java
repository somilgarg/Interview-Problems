import java.util.Deque;
import java.util.Scanner;
import java.util.*;

/**
 * Hackerrank Interview Practice Problem
 * https://www.hackerrank.com/challenges/balanced-brackets
 * By: Somil Garg 
 * Date:- 08/08/2019 
 */ 
 

public class BalancedBrackets{

    public static String solution(String s){
        Stack<String> st = new Stack<>();
        for(int i=0;i<s.length();i++){
                if(s.charAt(i) == '{' || s.charAt(i) == '(' || s.charAt(i) == '['){
                    st.push(String.valueOf(s.charAt(i)));
                }
                else{
                    if(st.isEmpty())
                        return "NO";
                    String stackTop = st.pop();
                    String value = String.valueOf(s.charAt(i));
                    if(value.equals("}") && stackTop.equals("{")){
                        continue;
                    }
                    else if(value.equals(")") && stackTop.equals("(")){
                        continue;
                    }
                    else if(value.equals("]") && stackTop.equals("[")){
                        continue;
                    }
                    else{
                        return "NO";
                    }
                }
        }
        if(st.isEmpty())
            return "YES";
        else
            return "NO";
    }
    private static final Scanner sc = new Scanner(System.in);
    public static void main(String args[]){
        int n = sc.nextInt();
        while(n!=0){
           String s = sc.next();
            String result = solution(s);
            System.out.println(result);
            n--;
        }
    }

}