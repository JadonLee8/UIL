import java.io.File;
import java.util.Scanner;

public class Concerto {
    public static void main(String[] args) throws Exception{
        Scanner r = new Scanner(new File("concerto.dat"));
        int numLines = r.nextInt();
        r.nextLine();
        for (int i = 0; i < numLines; i++){
            String theText = r.nextLine();
            int numMinors = 0;
            while (theText.indexOf("minor") != -1){
                theText = theText.substring(theText.indexOf("minor") + 5);
                numMinors++;
            }
            if (numMinors > 2) {
                System.out.println("It's over Vee Valdee! I have the high ground!");
            } else {
                System.out.println("You underestimate my music!");
            }
        }

    }
}
