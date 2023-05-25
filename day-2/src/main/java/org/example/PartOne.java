package org.example;

import static org.example.DataReader.getDataFromFile;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

class PartOne {

    private PartOne() {
    }

    public static int solvePartOne(String path) {

        final String FORWARD = "forward";
        final String UP = "up";
        final String DOWN = "down";
        List<String> dataList = getDataFromFile(path);

        if (dataList.isEmpty()) {
            return 0;
        }

        List<String> forwardList = getDataStream(dataList, FORWARD, false).toList();

        List<String> depthList = getDataStream(dataList, FORWARD, true).toList();

        Integer forwardSum = getSumFilteredByName(forwardList, FORWARD);
        Integer upSum = getSumFilteredByName(depthList, UP);
        Integer downSum = getSumFilteredByName(depthList, DOWN);

        return Math.abs(upSum - downSum) * forwardSum;
    }

    private static Stream<String> getDataStream(List<String> dataList, String name, boolean reverseFilter) {
        return dataList.stream().filter(nameFilter(name, reverseFilter));
    }

    private static Integer getSumFilteredByName(List<String> dataList, String name) {
        return getDataStream(dataList, name, false).map(PartOne::getIntFrom).reduce(Integer::sum).orElse(0);
    }

    private static int getIntFrom(String f) {
        return Integer.parseInt(f.substring(f.length() - 1));
    }

    private static Predicate<String> nameFilter(String name, boolean reverse) {
        if (!reverse) {
            return n -> n.startsWith(name);
        } else {
            return n -> !n.startsWith(name);
        }
    }
}