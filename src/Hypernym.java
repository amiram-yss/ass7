/**
 * @author Amiram Yassif
 * 314985474
 * ass7
 */
public class Hypernym {
    private String name;
    private HyponymCollection hyponyms;

    /**
     * Default constructor.
     */
    public Hypernym() {
        this.name = "";
        this.hyponyms = new HyponymCollection();
    }

    public Hypernym(String hypernymName) {
        this.name = hypernymName;
        this.hyponyms = new HyponymCollection();
    }

    @Override
    public String toString() {
        return name + ":" + hyponyms.toString();
    }

    public void addHyponym(String str) {
        if (hyponyms.containsKey(str)) {
            hyponyms.insertHyponym(str);
            //hyponyms.put(str, hyponyms.get(str) + 1);
            return;
        }
        hyponyms.insertHyponym(str);
        //hyponyms.put(str, 1);
    }
}
