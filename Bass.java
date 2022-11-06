import java.io.File;
import java.util.Scanner;

public class Bass{
    public static void main(String[] args) throws Exception{
        Scanner r = new Scanner(new File("bass.dat"));
        int numLines = r.nextInt();
        for (int i = 0; i < numLines; i++){
            int N = r.nextInt();
            int q = r.nextInt();
            int T = r.nextInt();
            double result = (Math.round((Math.log(Math.pow(N, q))/Math.log(2))/(Math.sqrt(Math.abs(42*Math.sin(T))))*100)/100.0);
            String resultS = "" + result;
            if (resultS.length() < 4){
                resultS = resultS + "0";
            }
            System.out.println(resultS);
        }
    }
}