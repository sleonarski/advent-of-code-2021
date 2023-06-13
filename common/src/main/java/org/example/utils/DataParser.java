package org.example.utils;

import static org.example.utils.DataReader.readFileAsList;

import java.util.List;

public class DataParser {

    public static List<Integer> parseInput(String path) {
        return convertToInteger(readFileAsList(path));
    }

    public static List<Integer> convertToInteger(List<String> inputList) throws NumberFormatException {
        return inputList.stream().map(Integer::parseInt).toList();
    }
}