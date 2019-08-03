import java.util.Scanner;

/**
 * Hackerrank Interview Practice Problem
 * https://www.hackerrank.com/challenges/jumping-on-the-clouds/problem
 * By: Somil Garg 
 * Date:- 03/08/2019 
 */ 
 

public class JumpClouds{

    static int jumpClouds(int arr[],int n){
        int ans = 0;
        while(i<n){
            if(i+2<n && arr[i+2]==0){
                i+=2;
                ans++;
            }
            else{
                i++;
                ans++;
            }
        }
        return ans;
    }
    
    private static final Scanner sc = new Scanner(System.in);
    public static void main(String args[]){
            int n = sc.nextInt();
            int arr[] = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            int result = jumpClouds(arr, n);
            System.out.println(result);
    }

}