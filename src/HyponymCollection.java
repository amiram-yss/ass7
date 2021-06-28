import java.util.*;

public class HyponymCollection extends LinkedHashMap<String, Integer> {

    /**
     *
     */
    public void insertHyponym(String hyponym) {
        if(this.containsKey(hyponym)) {
            this.put(hyponym, this.get(hyponym) + 1);
        } else {
            this.put(hyponym, 1);
        }
        List<Map.Entry<String,Integer>> ltr = new LinkedList<>(this.entrySet());
        ltr.sort(
                new Comparator<Map.Entry<String, Integer>>() {
                    @Override
                    public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                        return o1.getValue() - o2.getValue();
                    }
                });
        Collections.reverse(ltr);
        this.clear();
        for (Map.Entry<String, Integer> val : ltr) {
            this.put(val.getKey(), val.getValue());
        }
//        for (Map.Entry<String, Integer> val : ltr) {
//            System.out.print(val.getKey() + " (" + val.getValue() + ").");
//        }
    }

    /**
     * toString.
     * @return string representation.
     */
    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        List<Map.Entry<String,Integer>> ltr = new LinkedList<>(this.entrySet());
        for (Map.Entry<String,Integer> val : ltr) {
            str.append(" " + val.getKey() + " (" + val.getValue() + "),");
        }
        if (str.length() > 0) {
            str.substring(0, str.length());
        }
        return str.toString();
    }
}
