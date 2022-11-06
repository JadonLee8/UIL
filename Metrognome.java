import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Metrognome {
    public static void main(String[] args) throws Exception{
        Scanner r = new Scanner(new File("metrognome.dat"));
        int f = r.nextInt();
        r.nextLine();
        for (int i = 0; i < f; i++) {
            int divs = 0;
            int Anums = r.nextInt();
            r.nextLine();
            ArrayList<Integer> nums = new ArrayList<>();
            for (int k = 0; k < Anums; k++) {
                nums.add(r.nextInt());
                // System.out.println(nums.get(k));
            }
            int curN = 1;
            while(divs != nums.size()) {
                divs = 0;
                for (int s = 0; s < nums.size(); s++) {
                    if (curN%((int)nums.get(s)) == 0) {
                        divs++;
                    }
                }
                curN++;
            }
            System.out.println(curN-1);
            r.nextLine();
        }
        
    }
}