package OpdrachtenOO;

public class Vrachtauto extends Auto {
    private int laadvermogen;

    public int getLaadvermogen() {
        return laadvermogen;
    }

    public void setLaadvermogen(int laadvermogen) {
        this.laadvermogen = laadvermogen;
    }

    @Override
    public void rijden() {
        snelheid += 5;
    }

    @Override
    public void remmen() {
        snelheid -= 5;
    }

    public Vrachtauto(String merk, String kleur) {
        super(merk, kleur);
    }

}
