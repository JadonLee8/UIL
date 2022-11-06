import java.io.File;
import java.util.Scanner;

import javax.annotation.processing.SupportedOptions;

public class Pitch {
    public static void main(String[] args) throws Exception{
        Scanner r = new Scanner(new File("pitch.dat"));
        int numCases = r.nextInt();
        r.nextLine();
        for (int i = 0; i < numCases; i++){
            String[] p = r.nextLine().split(" ");
            String L = p[0];
            String FS = p[1];
            if (FS.equals("Flat")){
                FS = "Sharp";
            } else {
                FS = "Flat";
            }
            String[] notes = {"A", "B", "C", "D", "E", "F", "G"};
            if (L.equals(notes[0]) && FS.equals("Sharp")){
                L = notes[6];
            } else {
                for (int j = notes.length - 1; j > 0; j--){
                    if (L.equals(notes[j]) && FS.equals("Sharp")){
                        L = notes[j - 1];
                        break; 
                    } 
                }
                for (int j = 0; j < notes.length - 1; j++){
                    if (L.equals(notes[j])){
                        L = notes[j + 1];
                        break; 
                    } 
                }
            }
            System.out.println(L + " " + FS);
        }
    }
}
