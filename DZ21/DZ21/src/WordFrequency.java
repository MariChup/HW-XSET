import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class WordFrequency {

    public String readFile(String filePath) throws IOException {
        return new String(Files.readAllBytes(Paths.get(filePath)));
    }

    public List<String> splitIntoWords(String content) {
        Pattern pattern = Pattern.compile("\\W+");
        return Arrays.stream(pattern.split(content.toLowerCase()))
                .filter(word -> !word.isEmpty())
                .collect(Collectors.toList());
    }

    public Map<String, Long> countWordFrequencies(List<String> words) {
        return words.stream()
                .collect(Collectors.groupingBy(word -> word, Collectors.counting()));
    }

    public long findMaxFrequency(Map<String, Long> wordCount) {
        return wordCount.values().stream().max(Long::compare).orElse(0L);
    }

    public List<Map.Entry<String, Long>> findMostCommonWords(Map<String, Long> wordCount, long maxFreq) {
        return wordCount.entrySet().stream()
                .filter(entry -> entry.getValue() == maxFreq)
                .collect(Collectors.toList());
    }

    public void displayResults(List<String> words, Map<String, Long> wordCount, List<Map.Entry<String, Long>> mostCommonWords) {
        System.out.println("Отсортированные слова:");
        words.forEach(System.out::println);

        System.out.println("\nСтатистика по словам:");
        long totalWords = words.size();
        wordCount.forEach((word, count) -> {
            double percentage = (double) count / totalWords * 100;
            System.out.printf("%s: %d (%.2f%%)%n", word, count, percentage);
        });

        System.out.println("\nСлова с максимальной частотой:");
        mostCommonWords.forEach(entry -> System.out.println(entry.getKey() + ": " + entry.getValue()));
    }
}
