import java.util.Scanner;
import java.util.*;
import java.io.*;
import ST;

public class para {
   static char L1    = '(';
    static char R1    = ')';
    static    char L2   = '{';
    static   char R2    = '}';
    static   char L3  = '[';
    static   char R3  = ']';

    public static boolean isBalanced(String s) {
        Stack<Character> stack = new Stack<Character>();
        for (int i = 0; i < s.length(); i++) {

            if      (s.charAt(i) == L1)   stack.push(L1);

            else if (s.charAt(i) == L2)   stack.push(L2);

            else if (s.charAt(i) == L3) stack.push(L3);

            else if (s.charAt(i) == R1) {
                if (stack.isEmpty())        return false;
                if (stack.pop() != L1) return false;
            }

            else if (s.charAt(i) == R2) {
                if (stack.isEmpty())        return false;
                if (stack.pop() != L2) return false;
            }

            else if (s.charAt(i) == R3) {
                if (stack.isEmpty())        return false;
                if (stack.pop() != L3) return false;
            }

            // ignore all other characters

        }
        return stack.isEmpty();
    }


    public static void main(String[] args) {
    	 String s = StdIn.readAll();
         StdOut.println(isBalanced(s));
    }

}
