package Player;

public class Audio extends ElementoMultimediale {
    private int volume;

    public Audio(String titolo, int durata, int volume) {
        super(titolo, durata);
        this.volume = volume;
    }

    public void abbassaVolume() {
        for (int i = 0; i < this.volume; i++) {
            System.out.println("!");
        }
    }

    public void alzaVolume() {
        for (int i = 0; i < this.volume; i++) {
            System.out.println("!");

        }
    }

    @Override
    public void play() {
        for (int i = 0; i < this.getDurata(); i++) {
            System.out.println(this.getTitolo());
        }
    }
}
