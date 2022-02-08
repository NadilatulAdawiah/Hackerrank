import java.io.*;
import java.util.*;

public class Day5_JavaString_Tokens{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // Write your code here.
        // String[] result = s.split("\\s");
        // int n = result.length;
        // System.out.println(n);
        // //for each
        // for(String myString : result){
        //     System.out.println(myString);
        // }
        
        s = s.replaceAll("[!,?._'@\\s]+", " ");
        StringTokenizer st = new StringTokenizer(s);
        int n = st.countTokens();
        
        System.out.println(n);
        while(st.hasMoreTokens()){
        // for(int i=0;i<n;i++){
            System.out.println(st.nextToken());
        }
        scan.close();
    }
}