package main;

import java.util.*;


/**
 * Created by Konopatova on 25.01.2018.
 */


public class DictonaryWithPriority {
    private Map<Character, ArrayList<String>> dict = new TreeMap<Character, ArrayList<String>>();

    public DictonaryWithPriority(String string) {
        this.addString(string);
    }

    private void add(String word) {
        char firstChar = word.toCharArray()[0];
        if (!dict.keySet().contains(firstChar)){
            dict.put(firstChar, new ArrayList<String>());
        }
        dict.get(firstChar).add(word);
    }

    private void addString(String string) {
        if (string.length()!=0) {
            String[] arrayString = string.split(" ");
            for(String word: arrayString) {
                this.add(word);
            }
        }
    }

    private List getByFirstChar(char firstChar) {
        return dict.get(firstChar);
    }

    @Override
    public String toString(){
        StringBuilder finnaly = new StringBuilder();
        Comparator<String> comparator = new StringLengthComparator();
        List<String> sortedSet = new ArrayList<String>();
        finnaly.append("[");

        for (Map.Entry<Character, ArrayList<String>> entry : dict.entrySet()) {
            if (entry.getValue().size() > 1) {
                StringBuilder sb = new StringBuilder();
                entry.getValue().sort(comparator);
                sb.append(entry.getKey());
                sb.append("=");
                sb.append(entry.getValue().toString());
                sortedSet.add(sb.toString());
            }
        }
        finnaly.append(String.join(", ", sortedSet));

        finnaly.append("]");
        return finnaly.toString();
    }
}
