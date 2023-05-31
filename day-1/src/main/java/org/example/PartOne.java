package org.example;

import static org.example.DataReader.*;

import java.util.List;

class PartOne {

    private PartOne() {
    }

    public static int runPartOne(String path) {

        List<String> inputList = readFileAsList(path);
        List<Integer> dataList = convertToInteger(inputList);
        int increased = 0;

        if (!dataList.isEmpty()) {
            int prevVal = dataList.get(0);
            for (int currentVal : dataList) {
                if (currentVal > prevVal) {
                    increased++;
                }
                prevVal = currentVal;
            }
        }
        return increased;
    }
}