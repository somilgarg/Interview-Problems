import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * Hackerrank Interview Practice Problem
 * https://www.hackerrank.com/challenges/sherlock-and-anagrams
 * By: Somil Garg 
 * Date:- 03/08/2019 
 */ 
 

public class SherlockAnagram{

    static int solve(String str){
       int ans = 0;
       for(int i=1;i<=str.length();i++){
            List<String> list = new ArrayList<>();
            list = generatePermutations(i,str);
            for(int j=0;j<list.size();j++){
                for(int k=j+1;k<list.size();k++){
                    int result = compareStrings(list.get(j),list.get(k));
                    ans += result;
                }
            }
       }
       return ans; 
    }

    static int compareStrings(String str1,String str2){
        char[] charStr1 = str1.toCharArray();
        char[] charStr2 = str2.toCharArray();

        if(charStr1.length != charStr2.length)
            return 0;

        Arrays.sort(charStr1);
        Arrays.sort(charStr2);
        
       // System.out.println(str1+ " " + str2);
        for(int i=0;i< charStr1.length;i++){
            if(charStr1[i] != charStr2[i]){
                return 0;
            }
        }
        return 1;
    }

    static List<String> generatePermutations(int index,String str){
        List<String> stringList = new ArrayList<>();
        for(int i=0;i<str.length();i++){
            String subStr = str.substring(i, Math.min((i + index),str.length()));
            //System.out.println("index "+index +"string is "+subStr);
            stringList.add(subStr);
        }
        return stringList;
    }

    private static final Scanner sc = new Scanner(System.in);
    public static void main(String args[]){
           int q = sc.nextInt(); // No. Of Queries
           while(q!=0){
               String str = sc.next();
               int ans = solve(str);
               System.out.println(ans);
               q--;
           }
    }

}