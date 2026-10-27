import java.util.*;

public class WordFrequencyAnalyzer {


    public Map<String, Integer> countWords(String[] words) {
        Map<String, Integer> counts = new HashMap<String, Integer>();
        for (String s : words) {
            if (counts.containsKey(s)) {
                counts.put(s, counts.get(s) + 1);

            } else {
                counts.put(s, 1);
            }
        }
        return counts;
    }

    public void sortAlphabetically(String[] words) {
        Set<String> uniqueSortedSet = new TreeSet<>();
        for (String s : words) {
            uniqueSortedSet.add(s.toLowerCase());
        }

        System.out.println(uniqueSortedSet);

    }

    public void sortFrequencies(Map<String, Integer> wordFreq) {
        List<Map.Entry<String, Integer>> entries =
                new ArrayList<>(wordFreq.entrySet());

        entries.sort((a, b) -> {
            int frequencyCompare =
                    b.getValue().compareTo(a.getValue());

            if (frequencyCompare == 0) {
                return a.getKey().compareTo(b.getKey());
            }

            return frequencyCompare;
        });

        for (Map.Entry<String, Integer> entry : entries) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}

