package org.example.first_solution;

import org.example.utils.DataReader;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

import static org.example.utils.DataReader.readFileAsList;

class PartOneFirstSolution {

    private PartOneFirstSolution() {
    }

    public static int solvePartOne(String path) {

        final String FORWARD = "forward";
        final String UP = "up";
        final String DOWN = "down";
        List<String> dataList = readFileAsList(path);

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
        return getDataStream(dataList, name, false).map(PartOneFirstSolution::getIntFrom).reduce(Integer::sum).orElse(0);
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