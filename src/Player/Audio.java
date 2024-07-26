package Player;

import interfaces.Play;
import interfaces.Volume;

public class Audio extends ElementoMultimediale implements Volume, Play {
    private int durata;
    private int volume;

    public Audio(String titolo, int durata, int volume) {
        super(titolo);
        this.durata = durata;
        this.volume = volume;
    }


    @Override
    public void alzaVolume() {
        this.volume++;
        System.out.println("Il volume é " + this.volume);
    }

    @Override
    public void abbassaVolume() {

        this.volume--;
        System.out.println("Il volume é " + this.volume);
    }

    @Override
    public String mostraVolume() {
        String volume = "";
        for (int i = 0; i < this.volume; i++) {
            volume += "!";
        }
        return volume;

    }


    @Override
    public void play() {
        for (int i = 0; i < this.durata; i++) {
            System.out.println(this.getTitolo() + mostraVolume());
        }
    }

}
