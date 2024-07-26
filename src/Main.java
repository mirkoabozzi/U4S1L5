import Player.Audio;
import Player.ElementoMultimediale;
import Player.Immagine;
import Player.Video;
import interfaces.Play;

import java.util.Arrays;
import java.util.Objects;
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
            System.out.println("Che tipo di file vuoi riprodurre? Inserisci un tipo tra i seguenti: audio video immagine");
            String tipo = scanner.nextLine();
            if (Objects.equals(tipo, "0")) {
                break;
            } else {
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
                        System.out.println("Il tipo inserito non è corretto inserisci un tipo corretto");
                        i--;
                        break;
                }
            }
            //System.out.println(elementoMultimediale[i].getTitolo());
        }
        System.out.println(Arrays.toString(elementoMultimediale));

        while (true) {
            System.out.println("Cosa vuoi riprodurre?");
            for (int i = 0; i < elementoMultimediale.length; i++) {
                System.out.println("1 " + elementoMultimediale[i].getTitolo());
            }
            int scelta = scanner.nextInt();
            if (scelta == 0) {
                System.out.println("Grazie per essere stato con noi!");
                break;
            } else {
                if (elementoMultimediale[scelta - 1] instanceof Audio) {
                    ((Play) elementoMultimediale[scelta - 1]).play();
                } else if (elementoMultimediale[scelta - 1] instanceof Video) {
                    ((Play) elementoMultimediale[scelta - 1]).play();
                } else {
                    ((Immagine) elementoMultimediale[scelta - 1]).show();
                }
            }
        }
        scanner.close();
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
        audio.abbassaVolume();
        System.out.println(audio.mostraVolume());
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

        System.out.println("Inserisci la luminosità");
        int luminosita = scanner.nextInt();
        Video video = new Video(titolo, durata, volume, luminosita);
        video.play();
        video.alzaVolume();
        video.alzaLuminosita();
        System.out.println(video.luminosita());
        System.out.println(video.mostraVolume());
        return video;
    }

    public static ElementoMultimediale immagine() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci il titolo");
        String titolo = scanner.nextLine();

        System.out.println("Inserisci la luminosità");
        int luminosita = scanner.nextInt();

        Immagine immagine = new Immagine(titolo, luminosita);
        immagine.show();
        immagine.abbassaLuminosita();
        System.out.println(immagine.luminosita());
        return immagine;
    }
}