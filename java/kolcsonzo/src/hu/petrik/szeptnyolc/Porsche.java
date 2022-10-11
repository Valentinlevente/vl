package hu.petrik.szeptnyolc;

public class Porsche implements Auto{

    private double sebesseg;

    public Porsche(double sebesseg){
        this.sebesseg = sebesseg;
    }

    @Override
    public void gyorsul() {
        this.sebesseg = getSebesseg()+10;
    }

    @Override
    public double getSebesseg() {
        return this.sebesseg;
    }
}
