package org.example;

import java.awt.Window;
import java.util.List;

import static org.example.DataReader.convertToInteger;
import static org.example.DataReader.readFileAsList;

class PartTwo {

    private PartTwo() {
    }

    public static int runPartTwo(String path, int windowSize) {

        List<String> inputList = readFileAsList(path);
        List<Integer> dataList = convertToInteger(inputList);

        return dataList.stream().collect(() -> new AggregatedWindow(windowSize), AggregatedWindow::nextNumber, (aw1, aw2) -> {
            throw new CollectingException();
        }).getCount();

    }
}