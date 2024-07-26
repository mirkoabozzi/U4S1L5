import Player.Video;

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
        System.out.println("Inserisci la luminosita");
        int luminosita = scanner.nextInt();

        //Audio audio1 = new Audio(titolo, durata, volume);
        //audio1.play();
        //audio1.abbassaVolume();
        //System.out.println(audio1.show());

        Video video1 = new Video(titolo, durata, volume, luminosita);
        video1.play();
        video1.abbassaVolume();
        video1.alzaLuminosita();
        System.out.println(video1.show());

    }
}