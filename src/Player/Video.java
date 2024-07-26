package Player;

import interfaces.Play;
import interfaces.Volume;

public class Video extends ElementoMultimediale implements Volume, Play {

    private int luminosita;
    private int volume;
    private int durrata;

    public Video(String titolo, int luminosita, int volume, int durata) {
        super(titolo);
        this.luminosita = luminosita;
        this.volume = volume;
        this.durrata = durata;
    }

    @Override
    public void play() {

    }

    @Override
    public void alzaVolume() {

    }

    @Override
    public void abbassaVolume() {

    }

    @Override
    public String show() {
        return "";
    }
}
