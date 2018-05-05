import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int i=0;i<T;i++){
            int p = sc.nextInt();
            if(p==1 || p==0){
                System.out.println("Not prime");
                continue;
            }
            int count = 0;
            for(int j=2;j<=p/2;j++){
                if(p%j==0){
                   count++;
                    break;
                    
                }else{
                    continue;
                }
            }
            if(count!=0){
                System.out.println("Not prime");
            }else
            {
                System.out.println("Prime");
            }
        }
    }
}