package ru.nsu.hci.batenev.javalabs.lab4;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class FileStatistic {
    public StringBuilder fileText;

    public FileStatistic(String filepath) {
        try {
            fileText = new StringBuilder();
            BufferedReader reader = new BufferedReader(new FileReader(filepath));
            String line;
            while ((line = reader.readLine()) != null) {
                fileText.append(line).append("\n");
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public int letterCount() {
        String checker = String.valueOf(fileText);
        checker = checker.replaceAll("\\W", "")
                .replaceAll("\\d", "")
                .replaceAll("[_]+", "");
        return Integer.parseInt(String.valueOf(checker.length()));
    }

    public int wordCount() {
        String checker = String.valueOf(fileText);
        checker = checker.replaceAll("\\W", "_")
                .replaceAll(" ", "_")
                .replaceAll("[_]+", " ")
                .replaceAll("\\w", "");
        return Integer.parseInt(String.valueOf(checker.length()));
    }

    public int lineCount() {
        String checker = String.valueOf(fileText);
        int countOfRows = 0;
        for (int i = 0; i < checker.length(); i++) {
            if (checker.charAt(i) == '\n') {
                countOfRows++;
            }
        }
        return countOfRows;
    }

    public String letterFrequency() {
        Map<String, Integer> dictionaryOfLetters = new HashMap<>();
        String checker = String.valueOf(fileText);
        checker = checker.replaceAll("\\W", "")
                .replaceAll("\\d", "")
                .replaceAll("[_]+", "")
                .toLowerCase();
        for (int i = 0; i < checker.length(); i++) {
            if (dictionaryOfLetters.containsKey(String.valueOf(checker.charAt(i)))) {
                dictionaryOfLetters.put(String.valueOf(checker.charAt(i)),
                        dictionaryOfLetters.get(String.valueOf(checker.charAt(i))) + 1);
            } else {
                dictionaryOfLetters.put(String.valueOf(checker.charAt(i)),
                        1);
            }
        }
        return String.valueOf(dictionaryOfLetters).replaceAll("[{},]", "")
                .replaceAll("[ ]", "\n");
    }
}
