import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Day3_JavaEnd_Of_file {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int a = 1;
        while(sc.hasNext()){//Deteksi EOF
            
            String s = sc.nextLine();
            System.out.println(a+" "+s);
            a++;
        }

        sc.close();
    }
    
}
