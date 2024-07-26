package Player;

import interfaces.Luminosita;

public class Immagine extends ElementoMultimediale implements Luminosita {
    private int luminosita;

    public Immagine(String titolo, int luminosita) {
        super(titolo);
        this.luminosita = luminosita;
    }

    public void show() {
        for (int i = 0; i < this.luminosita; i++) {
            System.out.println(this.getTitolo() + luminosita());
        }
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
        return "Immagine{" +
                "luminosita=" + luminosita +
                '}';
    }
}
