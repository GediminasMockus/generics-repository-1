package uzduotis2;

import java.util.List;

public class Miskas extends Medis {


    public static void ivairusMiskas(List<? extends Medis> ivairusMedziai) {
        System.out.println("Ivairus miskas:");
        for (Medis medis : ivairusMedziai) {
            medis.turi();
        }
    }


    public static void spygliuociuMiskas(List<? extends Spygliuotis> spygliuociai) {
        System.out.println("Spygliuociu miskas:");
        for (Spygliuotis spygliuotis : spygliuociai) {
            spygliuotis.turi();
        }
    }


    public static void berzuMiskas(List<Berzas> berzai) {
        System.out.println("Berzu miskas:");
        for (Berzas berzas : berzai) {
            berzas.turi();
        }
    }

    @Override
    void turi() {

    }
}