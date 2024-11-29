import java.util.Scanner;

class Esercizio {

    public static void main(String args[])
    {
        Scanner in = new Scanner( System.in );
        int i, studenti;
        float sommaVotazioni, mediaVotazioni;
        do {
            System.out.println("Inserisci il numero di studenti: ");
            studenti = in.nextInt();
        } while (studenti<0);
        String [] nomi = new String [studenti];
        float [] votazioni = new Float [studenti];
        int [] crediti = new int [studenti];
        sommaVotazioni = 0;
        i = 0;
        while (i<studenti) {
            System.out.println("Inserisci il nome dello studente n°" + i+1 + ":");
            nomi[i] = in.next();
            System.out.println("Inserisci la sua votazione: ");
            votazioni[i] = in.nextFloat();
            System.out.println("Inserisci il numero dei suoi crediti: ");
            crediti[i] = in.nextInt();
            sommaVotazioni += votazioni[i];
            i++;
        }
        mediaVotazioni = sommaVotazioni/studenti;
        System.out.println("La media delle votazioni degli studenti è: " + mediaVotazioni);
        i = 0;
        while (i<studenti) {
            if (mediaVotazioni<votazioni[i] && crediti[i]>=6) {
                System.out.println("Lo studente " + nomi[i] + " finisce l'anno con una valutazione pari a " + votazioni[i] + " e con " + crediti[i] + "crediti");
            }
        }
    }
}