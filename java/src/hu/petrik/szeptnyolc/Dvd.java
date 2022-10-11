package hu.petrik.szeptnyolc;

public class Dvd implements kolcsonozheto{

    private String cim;
    private int hossz;

    public Dvd(String cim, int hossz) {
        this.cim = cim;
        this.hossz = hossz;
    }


    @Override
    public String megjelenitheto() {
        return String.format("%s (%d perc)", this.cim, this.hossz);
    }

    @Override
    public int meddigKolcsonozheto() {
        return 7;
    }
}
