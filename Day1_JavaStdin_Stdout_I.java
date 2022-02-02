import java.util.*;

public class Day1_JavaStdin_Stdout_I {
    //latihan 2 hari 1
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("inputkan 3 nilai: ");
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        
        System.out.println("Berikut hasil inputan: ");
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        scan.close();

    }
    
}
