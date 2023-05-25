package org.example;

import static java.util.Collections.emptyList;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

class DataReader {

    private DataReader() {
    }

    public static List<String> getDataFromFile(String path) {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(path))) {
            List<String> dataList = new ArrayList<>();
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                dataList.add(line);
            }
            return dataList;
        } catch (IOException e) {
            e.printStackTrace();
            return emptyList();
        }
    }
}