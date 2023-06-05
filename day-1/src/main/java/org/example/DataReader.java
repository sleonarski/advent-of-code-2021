package org.example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class DataReader {

    private DataReader() {
    }

    public static List<Integer> convertToInteger(List<String> inputList) {
        return inputList.stream().filter(DataReader::isDigit).map(Integer::parseInt).toList();
    }

    public static List<String> readFileAsList(String path) {
            List<String> stringList = new ArrayList<>();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(path))) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                stringList.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return stringList;
    }

    private static boolean isDigit(String s) {
        try {
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}