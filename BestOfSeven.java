//Ertugrul Gurbuz IC20X 500814237
//Het doel van deze opdracht is om een applicatie te schrijven die de resultaten van een best-of-seven
//serie inleest en de uitslag op het scherm afdrukt.

package com.company;
import java.util.Scanner;

public class BestOfSeven {
    public static void main(String[] args) {
        Scanner invoer = new Scanner(System.in);
        int[] puntenEersteTeam = new int[7];
        int[] puntenTweedeTeam = new int[7];
        String[] wedstrijden = new String[7];

        //String punten = "Aantal punten van het eerste team: ";
        int gewonnenEersteTeam = 0;
        int gewonnenTweedeTeam = 0;
        int gespeeldeWedstrijden = 0;

        wedstrijden[0] = "Uitslag Wedstrijd 1";
        wedstrijden[1] = "Uitslag Wedstrijd 2";
        wedstrijden[2] = "Uitslag Wedstrijd 3";
        wedstrijden[3] = "Uitslag Wedstrijd 4";
        wedstrijden[4] = "Uitslag Wedstrijd 5";
        wedstrijden[5] = "Uitslag Wedstrijd 6";
        wedstrijden[6] = "Uitslag Wedstrijd 7";

        System.out.print("Voer naam van eerste team in: ");
        String naamEersteTeam = invoer.nextLine();

        System.out.print("Voer naam van tweede team in: ");
        String naamTweedeTeam = invoer.nextLine();
        System.out.println();

        for(int i = 0; i < puntenEersteTeam.length; i++) {
            System.out.print(wedstrijden[i]);
            System.out.printf("%n %5s", "Aantal punten van het eerste team: ");
            puntenEersteTeam[i] = invoer.nextInt();

            System.out.printf("%10s", "Aantal punten van het tweede team: ");
            puntenTweedeTeam[i] = invoer.nextInt();
            System.out.println();

            gespeeldeWedstrijden += 1;

            if(puntenEersteTeam[i] > puntenTweedeTeam[i]) {
                gewonnenEersteTeam += 1;
            }
            else if(puntenTweedeTeam[i] > puntenEersteTeam[i]) {
                gewonnenTweedeTeam += 1;
            }
            if(gewonnenEersteTeam == 4) {
                break;
            }
            else if(gewonnenTweedeTeam == 4) {
                break;
            }
        }
        System.out.print("Aantal gespeelde wedstrijden: " + " " + gespeeldeWedstrijden);
        printWinnaar(naamEersteTeam, naamTweedeTeam, gewonnenEersteTeam, gewonnenTweedeTeam);

        for(int i = 0; i < gespeeldeWedstrijden; i++) {
            System.out.print("\nWedstrijd" + " " + (i+1) + ":" + naamEersteTeam + " " + "-" + " " + naamTweedeTeam + " " +
                    puntenEersteTeam[i] + " " + "-" + " " + puntenTweedeTeam[i]);
        }
    }
    static void printWinnaar(String team1, String team2, int aantalWinstTeam1, int aantalWinstTeam2) {
        if(aantalWinstTeam1 > aantalWinstTeam2) {
            System.out.print("\nTeam" + " " + team1 + " " + "heeft gewonnen met" + " " + aantalWinstTeam1 + " " + "-" + " " + aantalWinstTeam2);
            System.out.println();
        }
        else if(aantalWinstTeam2 > aantalWinstTeam1) {
            System.out.print("\nTeam" + " " + team2 + " " + "heeft gewonnen met" + " " + aantalWinstTeam2 + " " + "-" + " " + aantalWinstTeam1);
            System.out.println();
        }
    }
}
