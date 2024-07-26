package Player;

public abstract class ElementoMultimediale {
    private String titolo;
    private int durata;


    public ElementoMultimediale(String titolo, int durata) {
        this.titolo = titolo;
        this.durata = durata;
    }

    public abstract void play();

    public int getDurata() {
        return durata;
    }

    public String getTitolo() {
        return titolo;
    }

    @Override
    public String toString() {
        return "ElementoMultimediale{" +
                "titolo='" + titolo + '\'' +
                ", durata=" + durata +
                '}';
    }
}
