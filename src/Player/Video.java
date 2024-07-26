package Player;

import interfaces.Luminosita;
import interfaces.Play;
import interfaces.Volume;

public class Video extends ElementoMultimediale implements Volume, Play, Luminosita {

    private int durata;
    private int volume;
    private int luminosita;

    public Video(String titolo, int durata, int volume, int luminosita) {
        super(titolo);
        this.volume = volume;
        this.durata = durata;
        this.luminosita = luminosita;
    }

    @Override
    public void play() {
        for (int i = 0; i < this.durata; i++) {
            System.out.println(this.getTitolo() + mostraVolume() + luminosita());
        }
    }

    @Override
    public void alzaVolume() {
        this.volume++;
        System.out.println("Ho impostato il volume a " + this.volume);
    }

    @Override
    public void abbassaVolume() {
        this.volume--;
        System.out.println("Ho impostato il volume a " + this.volume);
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
    public String luminosita() {
        String luminosita = "";
        for (int i = 0; i < this.luminosita; i++) {
            luminosita += "*";
        }
        return luminosita;
    }

    @Override
    public void alzaLuminosita() {
        this.luminosita++;
        System.out.println("Ho impostato la luminosità a " + this.luminosita);
    }

    @Override
    public void abbassaLuminosita() {
        this.luminosita--;
        System.out.println("Ho impostato la luminosità a " + this.luminosita);
    }

    @Override
    public String toString() {
        return "Video{" +
                "durata=" + durata +
                ", volume=" + volume +
                ", luminosita=" + luminosita +
                '}';
    }
}
