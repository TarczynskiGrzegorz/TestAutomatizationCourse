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
            FileUtils.write(fileResult,distincNames1.toString());

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }


    private static String parseWord(String unformattedWord) {
        return StringUtils.trim(unformattedWord).toLowerCase();
    }


}



