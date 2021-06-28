import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class HypernymCollection extends TreeMap<String, Hypernym> {
    /**
     * Adds relation to
     * @param hyponym hyponym's name
     */
    public void insertHypernym(String hyponym) {
        this.put(hyponym, new Hypernym(hyponym));
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        for(Map.Entry<String,Hypernym> value : this.entrySet()) {
            str.append(value.getValue().toString() + "\n");
        }
        return str.toString();
    }

    public Hypernym getHypernymByKey(String key) {
        return this.get(key);
    }
}
