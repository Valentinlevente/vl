package hu.petrik.szeptnyolc;
import java.util.Random;

public class Tesla implements Auto{

    private double sebesseg;
    private static final Random rnd = new Random();

    public Tesla(){
        this.sebesseg = rnd.nextInt(60);
    }

    @Override
    public void gyorsul() {
        this.sebesseg = getSebesseg() + rnd.nextInt(15-5)+5;
    }

    @Override
    public double getSebesseg() {
        return this.sebesseg;
    }
}
