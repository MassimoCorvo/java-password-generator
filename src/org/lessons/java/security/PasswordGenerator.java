package org.lessons.java.security;

public class PasswordGenerator {
    public static void main(String[] args) {
        
        String nome = "Paolo";
        String cognome = "Rossi";
        String colorePreferito = "Rosso";
        int giornoNascita = 20;
        int meseNascita = 10;
        int annoNascita = 1950;

        int somma = giornoNascita + meseNascita + annoNascita;

        String password = nome + "-" + cognome + "-" + colorePreferito + "-" + somma;
        System.out.println(password);



    }
}
