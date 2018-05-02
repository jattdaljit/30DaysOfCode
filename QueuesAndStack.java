import java.io.*;
import java.util.*;
public class Solution {
    // Write your code here.
    
    char[] stack = new char[100];
    char[] queue = new char[100];
    int top=0,first=0,last=0;
    
    void pushCharacter(char c){
        stack[top]= c;
       
        top++;
    }
    
    void enqueueCharacter (char c){
        queue[last]= c;
        last++;
        
    }
    
    char popCharacter(){
        top--;
        char d = stack[top];
        
        return d;
        
    }
    
    char dequeueCharacter(){
        char e = queue[first];
         
        first++;
        return e;
    }

 public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        scan.close();

        // Convert input String to an array of characters:
        char[] s = input.toCharArray();

        // Create a Solution object:
        Solution p = new Solution();

        // Enqueue/Push all chars to their respective data structures:
        for (char c : s) {
            p.pushCharacter(c);
            p.enqueueCharacter(c);
        }

        // Pop/Dequeue the chars at the head of both data structures and compare them:
        boolean isPalindrome = true;
        for (int i = 0; i < s.length/2; i++) {
            if (p.popCharacter() != p.dequeueCharacter()) {
                isPalindrome = false;                
                break;
            }
        }

        //Finally, print whether string s is palindrome or not.
        System.out.println( "The word, " + input + ", is " 
                           + ( (!isPalindrome) ? "not a palindrome." : "a palindrome." ) );
    }
}