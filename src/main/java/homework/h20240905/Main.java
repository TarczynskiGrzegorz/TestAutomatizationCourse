package homework.h20240905;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.StringUtils;

import java.io.File;
import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        try {
            File file = new File("src/h05092024.txt");
            String distincNames1 =
                    Arrays.stream(FileUtils.readFileToString(file, "UTF-8").split("[.,; \n]"))
                            .map(Main::parseWord)
                            .filter(v -> !v.isEmpty())
                            .distinct()
                            .collect(Collectors.joining("\n"));
            File fileResult = new File("src/h05092024result.txt");
            FileUtils.write(fileResult, distincNames1);


            // solution by maps - in my opinion not such efficient as streams

            Map<String, Integer> wordsWithOccurrences = new HashMap<>();
            String[] words = FileUtils.readFileToString(file, "UTF-8").split("[.,; \n]");
            for (String w : words) {

                if (!w.isEmpty()) {
                    String formattedWord = StringUtils.trim(w).toLowerCase();
                    wordsWithOccurrences.put(formattedWord, wordsWithOccurrences.getOrDefault(formattedWord, 0) + 1);
                }
            }
            File fileResult2 = new File("src/h05092024result2.txt");
            StringBuilder distincNames2 = new StringBuilder();
            for (Map.Entry<String, Integer> e : wordsWithOccurrences.entrySet()) {
                if (e.getValue() != -1) {
                    distincNames2.append(e.getKey()).append(" :x").append(e.getValue()).append("\n");
                }
            }
            FileUtils.write(fileResult2, distincNames2.toString());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }


    }

    private static String parseWord(String unformattedWord) {
        return StringUtils.trim(unformattedWord).toLowerCase();
    }

}



