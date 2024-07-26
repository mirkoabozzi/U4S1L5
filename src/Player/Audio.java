package Player;

import interfaces.Play;
import interfaces.Volume;

public class Audio extends ElementoMultimediale implements Volume, Play {
    private int volume;
    private int durata;

    public Audio(String titolo, int durata, int volume) {
        super(titolo);
        this.volume = volume;
        this.durata = durata;
    }


    @Override
    public void alzaVolume() {
        this.volume = +1;

    }

    @Override
    public void abbassaVolume() {
        this.volume = -1;
    }

    @Override
    public String show() {
        String volume = "";
        for (int i = 0; i < this.volume; i++) {
            volume += "!";
        }
        return volume;

    }


    @Override
    public void play() {
        for (int i = 0; i < this.durata; i++) {
            System.out.println(this.getTitolo() + show());
        }
    }

}
