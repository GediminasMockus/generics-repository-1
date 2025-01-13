package uzduotis3;

import java.util.ArrayList;
import java.util.List;

public class Mapas<K, V> {
    private List<Pora<K, V>> sarasasPoru = new ArrayList<>();

    public void ideti(K raktas, V reiksme) {
        for (Pora<K, V> pora : sarasasPoru) {
            if (pora.getRaktas().equals(raktas)) {
                sarasasPoru.remove(pora);
                break;
            }
        }
        sarasasPoru.add(new Pora<>(raktas, reiksme));
    }

    public V gauti(K raktas) {
        for (Pora<K, V> pora : sarasasPoru) {
            if (pora.getRaktas().equals(raktas)) {
                return pora.getReiksme();
            }
        }
        return null;
    }
}

