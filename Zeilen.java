package com.company;

//Ertugrul Gurbuz IC20? 500814237
//Het doel van het programma is om op basis van de afgelegde afstand op verschillende dagen
//de totale afgelegde afstand te berekenen.

import java.util.Scanner;
public class Zeilen {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); //maak een scanner klasse aan

        System.out.print("Geef het aantal zeildagen: ");
        final double ZEE_MIJL = 1.852;                          //constante voor aantal KM in zeemijl
        int zeilDagen = input.nextInt();                        //voer het aantal dagen in dat gezeild is

        double[] zeilDagenAfstand = new double[zeilDagen];      //array om de afstanden per dag in op te slaan met zeildagen als lengte
        double totaleAfstandZeeMijlen = 0;                      //hier worden de zeemijlen die per dag zijn ingevoerd in totaal opgeslagen

        while(zeilDagen < 2 || zeilDagen > 30) {                //wanneer het aantal zeildagen kleiner zijn dan 2 en groter zijn dan 30
            System.out.print("Aantal zeildagen moet tussen de 2 en de 30 zijn!"); //voer zeildagen opnieuw in vanwege foutieve invoer
            System.out.print("\nGeef het aantal zeildagen: ");
            zeilDagen = input.nextInt();
        }

        System.out.println("Voer per zeildag de afgelegen afstand in zeemijlen in:");
        for(int i = 0; i < zeilDagenAfstand.length; i++ ) {     //itereer over de array zeildagen heen
            System.out.print("Dag" + " " + (i+1) + ": ");        //print de dagen uit met daarbij steeds 1 opgeteld
            zeilDagenAfstand[i] = input.nextDouble();           //voer per zeildag het aantal mijlen in en sla ze op in de array
            totaleAfstandZeeMijlen += zeilDagenAfstand[i];      //sla de zeemijlen die per dag in de array zijn ingevoerd op in de totalevariabele
        }
        double gemiddeldeZeeMijlenPerDag = totaleAfstandZeeMijlen / zeilDagen; //bereken de gemiddelde zeemijlen per dag

        System.out.println();
        System.out.print("Je hebt in totaal" + " " + totaleAfstandZeeMijlen + " " + "zeemijl afgelegd");  //print totale zeemijlen uit
        System.out.println("\nDit komt overeen met" + " " + berekenKilometers(totaleAfstandZeeMijlen) + " " + "KM");    //roep de bereken in KM methode aan
        System.out.println("Gemiddeld heb je" + " " + gemiddeldeZeeMijlenPerDag + " " + "zeemijl per dag gevaren");

        System.out.println();
        System.out.println("Overzicht afstand per zeildag:");

        for(int i = 0; i < zeilDagenAfstand.length; i++) {                      //itereer over de array heen waarin zeemijlen per dag zijn opgeslagen
            System.out.printf("%5s %d% 5.1f %5s %5.1f %s %n", "dag",(i+1),     //print met geformatteerde output de verschillende variabelen uit
                    zeilDagenAfstand[i],"zeemijl",(zeilDagenAfstand[i] * ZEE_MIJL),"km");
        }
    }

    public static double berekenKilometers(double aantalZeemijlen) { //maak een double methode waarin variabel totaleAfstandZeemijlen als input dient
        final double ZEE_MIJL = 1.852; // maak constante aan voor 1 zeemijl omgerekend naar KM
        double zeeMijlenInAfstandKM = aantalZeemijlen * ZEE_MIJL; //maak variabel totale zeemijlen omgerekend naar KM aan
        return zeeMijlenInAfstandKM; //geef de bovengenoemde variabel terug
    }
}
