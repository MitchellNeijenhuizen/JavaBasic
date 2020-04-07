package OpdrachtenOO;

class Main {

    public static void main(String[] args) {
        Vrachtauto truck1 = new Vrachtauto("Volvo", "Blauw");
        truck1.setLaadvermogen(1000);
        RaceAuto mijnTweedeAuto = new RaceAuto("Ferari", "rood");
        Fiets mijnFiets = new Fiets("VanMook", "grijs");

    }
}

/* Opdracht 1A/1B
class Main {

    public static void main(String[] args) {
        Auto mijnAuto = new Auto();
        mijnAuto.merk = "Tesla";
        mijnAuto.kleur = "rood";
        System.out.println(mijnAuto.snelheid = 50);

        mijnAuto.rijden();
        mijnAuto.remmen();

        Auto zijnAuto = new Auto();
        zijnAuto.merk = "Suzuki";
        zijnAuto.kleur = "grijs";
        System.out.println(zijnAuto.snelheid = 70);

        for (int i = 0; i < 2; i++) {
            zijnAuto.rijden();
        }
    }
}
*/

/* Opdracht 2
class Main {

    public static void main(String[] args) {
        Auto mijnAuto = new Auto();
        mijnAuto.setMerk("Tesla");
        mijnAuto.setKleur("Rood");
        System.out.println(mijnAuto.snelheid = 50);

        mijnAuto.rijden();
        mijnAuto.remmen();

        Auto zijnAuto = new Auto();
        zijnAuto.setMerk("Suzuki");
        zijnAuto.setKleur("Grijs");
        System.out.println(zijnAuto.snelheid = 70);

        for (int i = 0; i < 2; i++) {
            zijnAuto.rijden();
        }
    }
    */

/* opdracht 3
class Main {

    public static void main(String[] args) {
        Auto mijnAuto = new Auto("Tesla","Rood");
        System.out.println(mijnAuto.snelheid = 50);
        mijnAuto.rijden();
        mijnAuto.remmen();

        Auto zijnAuto = new Auto("Suzuki", "Grijs");
        System.out.println(zijnAuto.snelheid = 70);

        for (int i = 0; i < 2; i++) {
            zijnAuto.rijden();
        }
    }
}
*
*/

/*    Opdracht 4
Class auto veranderd door de setters eruit te halen en een
constructor te maken die de instance variabelen als parameters pakt.

public Auto(String merk, String kleur) {
        this.merk = merk;
        this.kleur = kleur;

        */

/*Opdracht 5
* De snelheid krijgt geen getters en setters
* omdat het een kortdurende eigenschap is.
*
* */

/*
class Main {

    public static void main(String[] args) {
        Auto mijnAuto = new Auto("Tesla","Rood");
        mijnAuto.setSnelheid(50);
        mijnAuto.rijden();
        mijnAuto.remmen();
        System.out.println(mijnAuto.toString());

        Auto zijnAuto = new Auto("Suzuki", "Grijs");
        zijnAuto.setSnelheid(70);

        for (int i = 0; i < 2; i++) {
            zijnAuto.rijden();
        }
        System.out.println(zijnAuto.toString());
    }
}
*/
