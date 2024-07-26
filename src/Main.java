import Player.Audio;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci il titolo");
        String titolo = scanner.nextLine();
        System.out.println("Inserisci la durata");
        int durata = scanner.nextInt();
        System.out.println("Inserisci volume");
        int volume = scanner.nextInt();

        Audio audio1 = new Audio(titolo, durata, volume);
        audio1.play();
        //audio1.volume();

    }
}