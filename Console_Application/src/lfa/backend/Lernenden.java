package lfa.backend;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Lernenden {
    private List<String> nachname = new ArrayList<String>();
    private List<String> vorname = new ArrayList<String>();
    private List<Integer> alter = new ArrayList<Integer>();
    private List<String> lernbegleiter = new ArrayList<String>();
    private List<String> qpa = new ArrayList<String>();
    private List<String> projekt = new ArrayList<String>();

    public void createLernenden() {
        Scanner sc = new Scanner(System.in);
        String eingabe;

        System.out.println("Geben sie den Nachnamen ein: ");
        nachname.add(sc.nextLine());
        System.out.println("Geben sie den Vornamen ein: ");
        vorname.add(sc.nextLine());
        System.out.println("Geben sie das Alter ein: ");
        alter.add(sc.nextInt());
        sc.nextLine();
        System.out.println("Geben sie den Lernbegleiter ein: ");
        lernbegleiter.add(sc.nextLine());
        System.out.println("Geben sie den QPA ein: ");
        qpa.add(sc.nextLine());
        System.out.println("Geben sie das Projekt ein: ");
        projekt.add(sc.nextLine());
        System.out.println("Lernenden erfasst\n");
    }

    public void deleteLernenden() {
        Scanner sc = new Scanner(System.in);
        int eingabe;
        System.out.println("Geben sie die ID des zu löschenden Lernenden ein: ");
        eingabe = sc.nextInt();

        nachname.remove(eingabe);
        vorname.remove(eingabe);
        alter.remove(eingabe);
        lernbegleiter.remove(eingabe);
        qpa.remove(eingabe);
        projekt.remove(eingabe);

        System.out.println("Lernenden gelöscht\n");
    }

    public void printLernende() {
        System.out.println("+-----+------------+------------+--------+------------------+------------------+------------+");
        System.out.println("| ID  | Nachname   | Vorname    | Alter  | Lernbegleiter    | QPA              | Projekt    |");
        System.out.println("+-----+------------+------------+--------+------------------+------------------+------------+");
        for(int i=0; i<vorname.size(); i++) {
            System.out.println(String.format("| %-4s| %-11s| %-11s| %-7s| %-17s| %-17s| %-11s|", i, nachname.get(i), vorname.get(i), alter.get(i), lernbegleiter.get(i), qpa.get(i), projekt.get(i)));
        }
        System.out.println("+-----+------------+------------+--------+------------------+------------------+------------+");
        System.out.println("Alle Lernenden: Anzahl ["+vorname.size()+"]\n");
    }
}
