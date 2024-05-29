import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReplaceCharacters {
    private static final String VOWELS = "аеёиоуыэюяАЕЁИОУЫЭЮЯ";
    private static final String CONSONANTS = "бвгджзйклмнпрстфхцчшщБВГДЖЗЙКЛМНПРСТФХЦЧШЩ";

    public static void main(String[] args) {
        String inputFile = "text.txt";
        String outputFile = "outputtextmasha.txt";
        
        replaceCharactersInFile(inputFile, outputFile);
    }

    private static void replaceCharactersInFile(String inputFile, String outputFile) {
        int vowelsCount = 0;
        int consonantsCount = 0;

        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile));
             BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))) {

            int character;
            while ((character = reader.read()) != -1) {
                char charToWrite = (char) character;
                if (VOWELS.indexOf(charToWrite) != -1) {
                    charToWrite = 'a';
                    vowelsCount++;
                } else if (CONSONANTS.indexOf(charToWrite) != -1) {
                    charToWrite = 'м';
                    consonantsCount++;
                }
                writer.write(charToWrite);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Количество гласных в новом файле: " + vowelsCount);
        System.out.println("Количество согласных в новом файле: " + consonantsCount);
    }
}
