import java.util.HashMap;
import java.util.Map;
import java.util.*;
import java.io.*;

public class Day22_Java_Map {
    public static void main(String []argh)
	{
		Scanner in = new Scanner(System.in);
		int n=in.nextInt();
		in.nextLine();
        
        Map<String, Integer> map = new HashMap<>();
		for(int i=0;i<n;i++)
		{
			String name=in.nextLine();
			int phone=in.nextInt();
			in.nextLine();
            map.put(name, phone);
		}
		while(in.hasNext())
		{
			String s=in.nextLine();
            try{
                int phone = map.get(s);
                System.out.println(s + "=" + phone);
            }
            catch(Exception e){
                System.out.println("Not found");
            }
		}
        in.close();
	}
}
