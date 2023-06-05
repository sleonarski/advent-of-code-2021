package org.example;

import static org.example.DataReader.*;

import java.util.List;

class PartOne {

    private PartOne() {
    }

    public static int runPartOne(String path, int windowSize) {

        List<String> inputList = readFileAsList(path);
        List<Integer> dataList = convertToInteger(inputList);

        return dataList.stream().collect(() -> new AggregatedWindow(windowSize), AggregatedWindow::nextNumber, (aw1, aw2) -> {
            throw new CollectingException();
        }).getCount();
    }
}