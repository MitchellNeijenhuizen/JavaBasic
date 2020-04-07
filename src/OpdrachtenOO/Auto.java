package OpdrachtenOO;

public class Auto implements Voertuig {
    private String merk;
    private String kleur;
    protected int snelheid;

    public int getSnelheid() {
        return snelheid;
    }

    public void setSnelheid(int snelheid) {
        this.snelheid = snelheid;
    }

    public String getMerk() {
        return merk;
    }

/*    public void setMerk(String merk) {
        this.merk = merk;
    }*/

    public String getKleur() {
        return kleur;
    }

/*    public void setKleur(String kleur) {
        this.kleur = kleur;
    }*/

    public void rijden() {
        snelheid += 10;
        System.out.println(snelheid);
    }
    public void remmen() {
        snelheid -= 10;
        System.out.println(snelheid);
    }

    public Auto(String merk, String kleur) {
        this.merk = merk;
        this.kleur = kleur;
    }

    @Override
    public String toString() {
        return "Auto{" +
                "merk='" + merk + '\'' +
                ", kleur='" + kleur + '\'' +
                ", snelheid=" + snelheid +
                '}';
    }
}
