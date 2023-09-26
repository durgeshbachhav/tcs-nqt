import java.util.*;

public class Uncommon {
    public static List<String> findUncommonWords(String sentence1, String sentence2) {
        String[] words1 = sentence1.split(" ");
        String[] words2 = sentence2.split(" ");
        
        Map<String, Integer> freqMap1 = createFrequencyMap(words1);
        Map<String, Integer> freqMap2 = createFrequencyMap(words2);
        
        List<String> uncommonWords = new ArrayList<>();
        
        for (String word : freqMap1.keySet()) {
            if (freqMap1.get(word) == 1 && !freqMap2.containsKey(word)) {
                uncommonWords.add(word);
            }
        }
        
        for (String word : freqMap2.keySet()) {
            if (freqMap2.get(word) == 1 && !freqMap1.containsKey(word)) {
                uncommonWords.add(word);
            }
        }
        
        return uncommonWords;
    }
    
    public static Map<String, Integer> createFrequencyMap(String[] words) {
        Map<String, Integer> freqMap = new HashMap<>();
        for (String word : words) {
            freqMap.put(word, freqMap.getOrDefault(word, 0) + 1);
        }
        return freqMap;
    }
    
    public static void main(String[] args) {
        String sentence1 = "this is a is sdlfj test";
        String sentence2 = "this is another test";
        List<String> uncommonWords = findUncommonWords(sentence1, sentence2);
        System.out.println("Uncommon words: " + uncommonWords);
    }
}
