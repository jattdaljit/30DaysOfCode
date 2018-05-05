import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
   
      int da,ma,ya,de,me,ye,fine;
    Scanner sc = new Scanner(System.in);
         da = sc.nextInt();
         ma = sc.nextInt();
         ya = sc.nextInt();
         de = sc.nextInt();
         me = sc.nextInt();
         ye = sc.nextInt();
        
    if(ya==ye){
        
        
        if(ma<=me){
            if(da<=de){
                
                fine=0;
                System.out.println(fine);
                
                
                
            }else{
                fine = 15*(da-de);
        System.out.println(fine);
               
            }
        }else{
         fine = 500 * (ma-me);
            System.out.println(fine);
        }
    }else if(ya<ye){
       fine=0;
       System.out.println(fine);
        
    }else{
     fine = 10000;
        System.out.println(fine);   
    }
    
    
    }
}