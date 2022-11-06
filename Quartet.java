import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Quartet {
    public static void main(String[] args) throws Exception{
        Scanner r = new Scanner(new File("quartet.dat"));
        int f = r.nextInt();
        r.nextLine();
        int totf = 0;
        for (int i = 0; i < f; i++) {
            totf = 0;
            String[] numS = r.nextLine().split(" ");
            int tots = 0;
            for (int k = 0; k < numS.length; k++) {
                String[] ab = r.nextLine().split(" ");
                int big = Integer.parseInt(ab[0]);
                for (int j = 0; j < ab.length; j++) {
                    if (Integer.parseInt(ab[j]) > big) {
                        big = Integer.parseInt(ab[j]);
                    }
                }
                tots += big;
            }
            totf += tots;
            System.out.println(totf);
        }
    }
}