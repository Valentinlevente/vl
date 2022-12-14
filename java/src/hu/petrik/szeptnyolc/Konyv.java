package hu.petrik.szeptnyolc;

public class Konyv implements kolcsonozheto{
    private String cim;
    private String szerzo;
    private String isbn;

    public Konyv(String cim, String szerzo, String isbn) {
        this.cim = cim;
        this.szerzo = szerzo;
        this.isbn = isbn;
    }

    @Override
    public String megjelenitheto() {
        return String.format("%s - %s", this.szerzo, this.cim);
    }

    @Override
    public int meddigKolcsonozheto() {
        return 14;
    }
}
