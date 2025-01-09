package uzduotis2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Medis> ivairusMedziai = new ArrayList<>();
        ivairusMedziai.add(new Berzas());
        ivairusMedziai.add(new Azuolas());
        ivairusMedziai.add(new Kadagys());
        ivairusMedziai.add(new Egle());
        ivairusMedziai.add(new Pusis());


        List<Spygliuotis> spygliuociai = new ArrayList<>();
        spygliuociai.add(new Kadagys());
        spygliuociai.add(new Egle());
        spygliuociai.add(new Pusis());


        List<Berzas> berzai = new ArrayList<>();
        berzai.add(new Berzas());
        berzai.add(new Berzas());
        berzai.add(new Berzas());


        Miskas.ivairusMiskas(ivairusMedziai);
        Miskas.spygliuociuMiskas(spygliuociai);
        Miskas.berzuMiskas(berzai);
    }
}
