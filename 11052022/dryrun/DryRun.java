package dryrun;

import java.io.File;
import java.util.Scanner;

public class DryRun {
    public static void main(String[] args) throws Exception{
        Scanner r = new Scanner(new File("dryrun.dat"));
        int numLines = r.nextInt();
        r.nextLine();
        for (int i = 0; i < numLines; i++){
            System.out.println("I like " + r.nextLine() + ".");
        }
    }
}