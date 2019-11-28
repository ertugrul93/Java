//Ertugrul Gurbuz IC20X 500814237
//Het doel van deze opdracht is om een applicatie te schrijven waarin de gebruiker per lokaal het aantal
//personen kan opgeven. De applicatie berekent op basis hiervan de bezettingsgraad per lokaal en de
//gemiddelde bezetting.

package com.company;
import java.util.Scanner;

public class BezettingsGraad {
    public static void main(String[] args) {
        Scanner invoer = new Scanner(System.in);
        final int MAX_KLASLOKAAL_CAPACITEIT = 32;
        String[] klasLokalen = new String[5]; //array van 5 lokalen
        String foutieveInput = "Foutieve invoer";
        int[] aantalPersonen = new int[5]; //array van aantal personen

        klasLokalen[0] = "TTH5A19: "; //array inhoud van lokalen
        klasLokalen[1] = "TTH5A23: ";
        klasLokalen[2] = "TTH5A30: ";
        klasLokalen[3] = "KSH4A18: ";
        klasLokalen[4] = "KSH4A23: ";

        for (int i = 0; i < klasLokalen.length; i++) { //voor elke item in de lokalen array
            System.out.printf("%5s", klasLokalen[i]); //print de item met formatted string
            aantalPersonen[i] = invoer.nextInt(); //sla het aantal personen op in de personen array

            while (aantalPersonen[i] < 0) {
                System.out.printf("%s %n", foutieveInput);
                System.out.printf("%5s", klasLokalen[i]); //print de item met formatted string
                aantalPersonen[i] = invoer.nextInt(); //sla het aantal personen op in de personen array
            }
        }
        System.out.println();
        System.out.printf("%s", "Lokaal");
        System.out.printf("%10s", "Personen");
        System.out.printf("%17s %n", "Bezettingsgraad");

        for (int i = 0; i < aantalPersonen.length; i++) {
            System.out.printf("%5s", klasLokalen[i]);
            System.out.printf("%5d", aantalPersonen[i]);
            System.out.printf("%10.1f %n", berekenBezettingsgraad(MAX_KLASLOKAAL_CAPACITEIT, aantalPersonen[i]));
        }
    }

    public static double berekenBezettingsgraad(int maxCapaciteit, int aantalPersonen) {
        int honderdProcent = 100;
        double bezettingsGraad = (double)aantalPersonen / maxCapaciteit * honderdProcent;
        return bezettingsGraad;
    }
}

