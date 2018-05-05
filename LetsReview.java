import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
       
        char[][] s = new char[T][];
        
        for(int i=0;i<T;i++){
            
        s[i] = scan.next().toCharArray();
      
            
            for (int j=0;j<s[i].length;j++){
                if(j==0){
                   System.out.print(s[i][j]);
                }
                else if(j%2==0){
                   System.out.print(s[i][j]);
                }}
            System.out.print(" ");
            for (int j=0;j<s[i].length;j++){
                if(j==0){
                   continue;
                }
                else if(j%2==0){
                  continue;
                }else{
                    System.out.print(s[i][j]);
                }}
            
            System.out.print("\n");
            
            
        }
    }
}