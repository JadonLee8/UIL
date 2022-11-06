import java.io.File;
import java.util.Scanner;

public class Forte {
    public static void main(String[] args) throws Exception{
        Scanner r = new Scanner(new File("forte.dat"));
        int numLines = r.nextInt();
        int[] soundVals = new int[numLines];
        for (int i = 0; i < numLines; i++){
            soundVals[i] = r.nextInt();
            if (soundVals[i] < 0){
                if (Math.abs(soundVals[i]) == 1){
                    System.out.println("piano");
                } else {
                    System.out.print("pianissi");
                    for (int j = Math.abs(soundVals[i]) - 2; j > 0; j--){
                        System.out.print("ssi");
                    }
                    System.out.println("mo");
                } 
            } else {
                if (soundVals[i] == 1){
                    System.out.println("forte");
                } else {
                    System.out.print("fortissi");
                    for (int j = soundVals[i] - 2; j > 0; j--){
                        System.out.print("ssi");
                    }
                    System.out.println("mo");
                }
            }
        }

        
    }


}
