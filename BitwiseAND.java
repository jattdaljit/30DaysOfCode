import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
       
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            int k = in.nextInt();
           
             int max=0;
            for(int i=1; i<=n ; i++){
                
                for(int j=1; j<=n; j++){
                 if(i==j)
                     continue;
                    
                    if(i<j){
                        int l = i & j ; 
                    
                        if(l<k){
                            if(l>max)
                            {
                            max = l;
                            }                  
                    }
                  }else{
                        continue;
                    }
                }
           
            }
            
            System.out.println(max);
            
        }
        
        
        
    }
}