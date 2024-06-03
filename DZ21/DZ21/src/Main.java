import java.io.IOException;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        String filePath = "text";  // Укажите путь к вашему файлу
        WordFrequency wf = new WordFrequency();

        try {
            String content = wf.readFile(filePath);
            List<String> words = wf.splitIntoWords(content);
            words.sort(String::compareTo);
            Map<String, Long> wordCount = wf.countWordFrequencies(words);
            long maxFreq = wf.findMaxFrequency(wordCount);
            List<Map.Entry<String, Long>> mostCommonWords = wf.findMostCommonWords(wordCount, maxFreq);
            wf.displayResults(words, wordCount, mostCommonWords, maxFreq);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
