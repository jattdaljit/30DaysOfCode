import java.io.*;
import java.util.*;
import java.util.Collections;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        
        List<String> names = new ArrayList<String>();
        Pattern pattern = Pattern.compile(".+@gmail\\.com$");
        for(int a0 = 0; a0 < N; a0++){
            String firstName = in.next();
            String emailID = in.next();
            
             Matcher matcher = pattern.matcher(emailID);
            if (matcher.find()){
               names.add(firstName);
            }
            
        }
        Collections.sort(names);
        
        for(String firstName : names){
            System.out.println(firstName);
        }
    }
}