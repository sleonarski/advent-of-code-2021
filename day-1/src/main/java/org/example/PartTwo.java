package org.example;

import java.awt.Window;
import java.util.List;

import static org.example.DataReader.convertToInteger;
import static org.example.DataReader.readFileAsList;

class PartTwo {

    private PartTwo() {
    }

    public static int runPartTwo2(String path) {

        List<String> inputList = readFileAsList(path);
        List<Integer> dataList = convertToInteger(inputList);
        final int windowSize = 3;
        int increased = 0;
        int prevWindow = 0;
        if (!dataList.isEmpty() && dataList.size() >= windowSize) {
            for (int j = 0; j < windowSize; j++) {
                prevWindow += dataList.get(j);
            }
            for (int i = windowSize; i < dataList.size(); i++) {
                int currentWindow = prevWindow + dataList.get(i) - dataList.get(i - windowSize);

                if (currentWindow > prevWindow) {
                    increased++;
                }
                prevWindow = currentWindow;
            }
        }
        return increased;
    }

    public static int runPartTwo(String path) {

        List<String> inputList = readFileAsList(path);
        List<Integer> dataList = convertToInteger(inputList);

        return dataList.stream().collect(() -> new AggregatedWindow(3), AggregatedWindow::nextNumber, (aw1, aw2) -> {
            throw new RuntimeException();
        }).getCount();

    }
}