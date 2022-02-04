import java.io.*;
import java.util.*;


public class Day3_JavaStrings_Introduction {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        
        int lA = A.length();
        int lB = B.length();
        int l = lA + lB;
        
        System.out.println(A.length()+B.length());
        
        if(A.compareTo (B)>0){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
        
        System.out.println(A.substring(0,1).toUpperCase()+A.substring(1) + " " + B.substring(0,1).toUpperCase()+B.substring(1));
        
        sc.close();
    }
}
