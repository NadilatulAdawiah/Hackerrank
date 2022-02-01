import java.io.*;
import java.text.*;
import java.util.*;


class Result{
    public static String findDay(int month, int day, int year) {
        SimpleDateFormat sdf = new SimpleDateFormat("EEEEE");
        //objek
        Calendar calendar = new GregorianCalendar(year, month-1, day);
        String hari = sdf.format(calendar.getTime());
        hari = hari.toUpperCase();
        return hari;

    }

}

public class latihan12 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int month = Integer.parseInt(firstMultipleInput[0]);

        int day = Integer.parseInt(firstMultipleInput[1]);

        int year = Integer.parseInt(firstMultipleInput[2]);

        String res = Result.findDay(month, day, year);

        bufferedWriter.write(res);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
