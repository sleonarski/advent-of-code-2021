package org.example;

import java.util.List;

import static org.example.Command.parse;
import static org.example.utils.DataReader.*;

public class DayTwoPartTwo {

    private DayTwoPartTwo(){}

    public static int solvePartTwo(String path) {
        return solvePartTwo(readFileAsList(path));
    }

    public static int solvePartTwo(List<String> dataList) {
        if (dataList.isEmpty()) {
            return 0;
        }
        return new SimpleSubmarine(parse(dataList), true).getSumValue();
    }
}