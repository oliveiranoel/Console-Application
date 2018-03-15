package lfa.backend;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String eingabe;

        Lernenden lern = new Lernenden();

        do {
            System.out.println("Welche Operation willst du ausführen?");

            System.out.println("1 - Neuen Lernenden erfassen");
            System.out.println("2 - Lernenden löschen");
            System.out.println("3 - Alle Lernende auflisten");
            System.out.println("q - Beenden");

            System.out.println("Gib eine Nummer ein : ");
            eingabe = sc.nextLine();

            switch (eingabe) {
                case "1":   System.out.println("Neuen Lernenden erfassen\n");
                            lern.createLernenden();
                            break;
                case "2":   System.out.println("Lernenden löschen\n");
                            lern.deleteLernenden();
                            break;
                case "3":   System.out.println("Alle Lernende auflisten\n");
                            lern.printLernende();
                            break;
                case "q":   System.out.println("Beenden");
                            System.out.println("BYE");
                            System.exit(0);
                            break;
                default:    System.out.println("ERROR: Bitte gültigen Wert eingeben!\n");
                            break;
            }
        } while (eingabe != "q");
    }
}
