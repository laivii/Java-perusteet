import java.util.Scanner;
public class KysyNimi {
    public static void main (String [] args){
        String sukunimi = "";
        String etunimi = "";
        Int ika = 0;

        Scanner lukija = new Scanner(System.in);

        System.out.print("Anna sukunimi: ");
        sukunimi = lukija.nextLine();

        System.out.print("Anna etunimi: ");
        etunimi = lukija.nextLine();

        System.out.print("Anna ikä: ");
        ika = lukija.nextInt();

        String kokonimi = etunimi + sukunimi;

        System.out.println("Olet " + kokonimi + "ja ikäsi on " + ika);

        lukija.close();
    }
}
