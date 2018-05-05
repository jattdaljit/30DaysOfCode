import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String s = Integer.toBinaryString(n);
       char[] c = new char[s.length()];
        
        c = s.toCharArray();
    
        int count = 0,max=0;
        for(int i=0;i<c.length;i++){
            if(c[i]=='1'){
                
                count++;
            
                
            }else{
                count=0;
               
            }
            if(count>max){
                max=count;
            }
        }
        System.out.println(max);
       
        
    }
}
