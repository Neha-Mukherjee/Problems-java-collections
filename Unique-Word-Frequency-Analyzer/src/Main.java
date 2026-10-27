
import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner para = new Scanner(System.in);
        System.out.println("Type Your Paragraph:");
        String paragraph = para.nextLine();
        String[] words = paragraph.toLowerCase()
                .replaceAll("\\p{Punct}"," ")
                .split("\\s+");
        WordFrequencyAnalyzer freq = new WordFrequencyAnalyzer();
        Map<String, Integer> wordFreq = freq.countWords(words);
        Set<String> uniqueSortedSet = new TreeSet<>(wordFreq.keySet());

        for (String s : uniqueSortedSet) {
            System.out.println(s+" : "+wordFreq.get(s));
        }




 //       System.out.println(Arrays.toString(words));

    }
}