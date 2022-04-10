import java.util.Scanner;

public class Lasku {
    public static void main(String[] args){
        int luku1 = 0, luku2 = 0;

        Scanner lukija = new Scanner(System.in);
    
        System.out.print("Anna ensimmäinen luku: ");
        luku1 = lukija.nextInt();

        System.out.print("Anna toinen luku: ");
        luku2 = lukija.nextInt();

        System.out.println("Antamiesi lukujen summa on " + (luku1 + luku2));

        lukija.close();
    }
}
