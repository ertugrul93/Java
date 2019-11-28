//Ertugrul Gurbuz IC104 500814237
//Doel van het programma is om docenten te helpen met het analyseren van tentamenresultaten

package com.company;

import java.util.Scanner;

public class Tentamencijfers {
    public static void main(String [] args) {
        Scanner invoer = new Scanner(System.in);

        System.out.print("Hoeveel cijfers wilt u invoeren: ");
        int cijfers = invoer.nextInt();

        while(cijfers == 0) { System.out.print("Aantal cijfers moet groter zijn dan 0!");
        System.out.println();

        System.out.print("\nHoeveel cijfers wilt u invoeren: ");
        cijfers = invoer.nextInt();
        }

        double[] cijfersArray = new double[cijfers];

        System.out.println();
        System.out.print("Aantal cijfers: " + " " + cijfersArray.length);
        System.out.print("\nAantal voldoendes: " + " " + krijgAantalVoldoendes(cijfersArray));
        System.out.println("\nHoogste cijfer: " + " " + krijgHoogsteCijfer(cijfersArray));
        System.out.println("Gemiddelde cijfer: " + " " + krijgGemiddelde(cijfersArray));
     }
    static double krijgGemiddelde(double[] array) {
        double total = 0;
        double gemiddelde = 0;

        for(int i = 0; i < array.length; i++) {
            total += array[i];
        }
        gemiddelde += total;
        gemiddelde = gemiddelde / array.length;
        return gemiddelde;
    }
    static int krijgAantalVoldoendes(double[] array) {
        int aantalVoldoendes = 0;
        for(int i = 0; i < array.length; i++) {
            if(array[i] >= 5.5) {
                aantalVoldoendes += 1;
            }
        }
        return aantalVoldoendes;
    }
    static double krijgHoogsteCijfer(double[] array) {
        double hoogsteCijfer = 0;
        for(int i = 0; i < array.length; i++) {
            hoogsteCijfer = Math.max(array[i], array[i]);
        }
        return hoogsteCijfer;
    }
    }