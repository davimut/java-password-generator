
//password generator

package org.lessons.java.security;

import java.util.Scanner;

public class PasswordGenerator {

public static void main (String [] args) {
Scanner input = new Scanner(System.in) ;

System.out.println("inserisici il tuo nome") ;

String nome = input.nextLine() ;

System.out.println("inserisici il tuo cognome ") ;

String cognome = input.nextLine() ;

System.out.println("inserisici il tuo colore preferito ") ;

String colore = input.nextLine() ;

System.out.println("inserisici il giorno in cui sei nato ") ;

int giorno= input.nextInt() ;

System.out.println("inserisici il mese in cui sei nato ") ;

int mese = input.nextInt() ;

System.out.println("inserisici l'anno in cui sei nato ") ;

int anno = input.nextInt() ;

int sommaData = giorno + mese + anno ;

System.out.println( "la tua password è " + nome + "-" + cognome + "-"  + colore + "-" + sommaData) ;

   }
}
