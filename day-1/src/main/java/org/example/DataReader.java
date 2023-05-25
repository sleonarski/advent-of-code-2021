package org.example;

import static java.util.Collections.emptyList;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class DataReader {

    private DataReader() {
    }

    public static List<Integer> getDataAsIntegersList(String path) {
        return readFileAsList(path).stream().map(Integer::parseInt).toList();
    }

    public static List<String> readFileAsList(String path) {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(path))) {
            List<String> stringList = new ArrayList<>();
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                stringList.add(line);
            }
            return stringList;
        } catch (IOException e) {
            e.printStackTrace();
            return emptyList();
        }
    }
}