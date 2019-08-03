import java.util.Scanner;

/**
 * Hackerrank Interview Practice Problem
 * https://www.hackerrank.com/challenges/repeated-string
 * By: Somil Garg 
 * Date:- 03/08/2019 
 */ 
 

public class RepeatedString{

    static long solution(String s,long n){
        int strLength = s.length();
        long result = 0;
        int cnta = 0;
        int cntb = 0;
        
        for (int i = 0; i < strLength; i++) {
           if(s.charAt(i) == 'a' )
                cnta++;
           if((i<(n%strLength)) && s.charAt(i) == 'a')
                cntb++;
        }
        result = (n/strLength) * cnta;
        result += cntb;

        return result;
    }
    private static final Scanner sc = new Scanner(System.in);
    public static void main(String args[]){
            String s = sc.nextLine();
            long n = sc.nextLong();

            long result = solution(s,n);
            System.out.println(result);
    }

}