import Player.Audio;
import Player.ElementoMultimediale;
import Player.Immagine;
import Player.Video;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        /*System.out.println("Inserisci il titolo");
        String titolo = scanner.nextLine();

        System.out.println("Inserisci la durata");
        int durata = scanner.nextInt();

        System.out.println("Inserisci volume");
        int volume = scanner.nextInt();

        System.out.println("Inserisci la luminosita");
        int luminosita = scanner.nextInt();

        Audio audio1 = new Audio(titolo, durata, volume);
        audio1.play();
        audio1.abbassaVolume();
        System.out.println(audio1.mostraVolume());

        Video video1 = new Video(titolo, durata, volume, luminosita);
        video1.play();
        video1.abbassaVolume();
        video1.alzaLuminosita();
        System.out.println(video1.mostraVolume());

        Immagine immagine1 = new Immagine(titolo, luminosita);
        immagine1.show();
        immagine1.abbassaLuminosita();*/


        ElementoMultimediale[] elementoMultimediale = new ElementoMultimediale[5];

        for (int i = 0; i < elementoMultimediale.length; i++) {
            System.out.println("Che tipo di file vuoi riprodurre?");
            String tipo = scanner.nextLine();

            switch (tipo) {
                case "audio":
                    elementoMultimediale[i] = audio();
                    break;
                case "video":
                    elementoMultimediale[i] = video();
                    break;
                case "immagine":
                    elementoMultimediale[i] = immagine();
                    break;
                default:
                    break;

            }

        }
        System.out.println(Arrays.toString(elementoMultimediale));

    }

    public static ElementoMultimediale audio() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci il titolo");
        String titolo = scanner.nextLine();

        System.out.println("Inserisci la durata");
        int durata = scanner.nextInt();

        System.out.println("Inserisci volume");
        int volume = scanner.nextInt();
        Audio audio = new Audio(titolo, durata, volume);
        audio.play();
        return audio;
    }

    public static ElementoMultimediale video() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci il titolo");
        String titolo = scanner.nextLine();

        System.out.println("Inserisci la durata");
        int durata = scanner.nextInt();

        System.out.println("Inserisci volume");
        int volume = scanner.nextInt();

        System.out.println("Inserisci la luminosita");
        int luminosita = scanner.nextInt();
        Video video = new Video(titolo, durata, volume, luminosita);
        video.play();
        return video;
    }

    public static ElementoMultimediale immagine() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci il titolo");
        String titolo = scanner.nextLine();

        System.out.println("Inserisci la luminosita");
        int luminosita = scanner.nextInt();

        Immagine immagine = new Immagine(titolo, luminosita);
        immagine.show();
        return immagine;
    }

}