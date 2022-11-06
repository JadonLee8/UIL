import java.io.File;
import java.util.Scanner;

public class Piano {
    public static void main(String[] args) throws Exception{
        Scanner r = new Scanner(new File("piano.dat"));
        int numLines = r.nextInt();
        r.nextLine();
        for (int i = 0; i < numLines; i++){
            r.nextLine();
            int numAdditions = 0;
            String road = r.nextLine();
            String[] dotSets = road.split("-");
            if (dotSets.length != 0){ 
                for (int d = 0; d < dotSets.length; d++){
                    if (dotSets[d].length() > 2){
                        numAdditions += dotSets[d].length()/3;
                    }
                }
            }
            System.out.println(numAdditions);
        }
    }
}
