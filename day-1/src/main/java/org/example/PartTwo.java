package org.example;

import static org.example.utils.DataParser.parseInput;

import java.util.List;


public class PartTwo {

    private PartTwo() {
    }

    public static int runPartTwo(String path, int windowSize) {
        return runPartTwo(parseInput(path), windowSize);
    }

    public static int runPartTwo(List<Integer> parsedInput, int windowSize) {
        return parsedInput.stream().collect(() -> new AggregatedWindow(windowSize), AggregatedWindow::nextNumber, (aw1, aw2) -> {
            throw new CollectingException();
        }).getCount();
    }
}