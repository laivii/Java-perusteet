import java.util.Scanner;
public class Palkkalaskenta {
    public static void main(String[] args) {
        Double työtunnit = 0.0, tuntipalkka = 0.0, vero = 0.0;
        
        Scanner lukija = new Scanner(System.in);

        System.out.print("Anna tehtyjen työtuntien määrä: ");
        työtunnit = lukija.nextDouble();

        System.out.print("Anna tuntipalkka: ");
        tuntipalkka = lukija.nextDouble();

        System.out.print("Anna veroprosentti: ");
        vero = lukija.nextDouble();

        Double veroprosentti = (vero / 100);
        Double kkpalkka = (työtunnit * tuntipalkka);
        Double verot = (kkpalkka * veroprosentti);

        System.out.println("Palkka ilman veroja: " + kkpalkka);
        System.out.println("Veron osuus palkasta: " + verot);
        System.out.println("Palkka verojen jälkeen: " + (kkpalkka - verot));

        lukija.close();
    }   
}
