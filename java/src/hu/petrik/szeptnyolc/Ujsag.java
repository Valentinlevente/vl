package hu.petrik.szeptnyolc;

public class Ujsag implements kolcsonozheto{
   private String cim;
   private int kiadasEv;
   private int kiadasHet;

    public Ujsag(String cim, int kiadasEv, int kiadasHet) {
        this.cim = cim;
        this.kiadasEv = kiadasEv;
        this.kiadasHet = kiadasHet;
    }

    @Override
    public String megjelenitheto() {
        return String.format("%s %d/%d.", this.cim, this.kiadasEv, this.kiadasHet);
    }

    @Override
    public int meddigKolcsonozheto() {
        return 0;
    }
}
