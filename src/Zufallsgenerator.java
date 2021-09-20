import java.util.Random;
import java.util.Scanner;

/**
 * @author xamtodd
 * @version 1.0
 */

public class Zufallsgenerator {
    private void erzeugen(int min, int max, int anz){ //Zufallszahlen erzeugen
        Random random = new Random();
        for(int i = 0; i <= anz - 1; i++){
            int rInt = random.nextInt(max) + min;
            System.out.println(rInt);
        }

    }
    public Zufallsgenerator(){ //Konstrucktor
        Scanner s = new Scanner(System.in);
        System.out.println("Geben Sie das Minima ein:");
        int minima = s.nextInt();
        System.out.println("Geben Sie das Maxima ein:");
        int maxima = s.nextInt();
        System.out.println("Geben Sie die Anzahl ein:");
        int anzahl = s.nextInt();
        erzeugen(minima, maxima, anzahl);
    }
    public static void main(String[] args) { //Main Methode
        new Zufallsgenerator();
    }
}
