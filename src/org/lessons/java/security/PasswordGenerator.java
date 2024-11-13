package org.lessons.java.security;

import java.util.Scanner;

public class PasswordGenerator {
    public static void main(String[] args) {

        Scanner inputScanner = new Scanner(System.in);

        System.out.println("Inserisci il nome e premi invio");
        String nome = inputScanner.nextLine();

        System.out.println("Inserisci il cognome e premi invio");
        String cognome = inputScanner.nextLine();

        System.out.println("Inserisci il colore preferito e premi invio");
        String colorePreferito = inputScanner.nextLine();

        System.out.println("Inserisci il giorno di nascita e premi invio");
        int giornoNascita = inputScanner.nextInt();

        System.out.println("Inserisci il mese di nascita e premi invio");
        int meseNascita = inputScanner.nextInt();

        System.out.println("Inserisci l'anno di nascita e premi invio");
        int annoNascita = inputScanner.nextInt();

        int somma = giornoNascita + meseNascita + annoNascita;

        String password = nome + "-" + cognome + "-" + colorePreferito + "-" + somma;
        System.out.println(password);

        inputScanner.close();

    }
}
