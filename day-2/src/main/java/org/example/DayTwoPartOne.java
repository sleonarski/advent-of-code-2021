package org.example;

import java.util.List;

import static org.example.Command.*;
import static org.example.utils.DataReader.*;

public class DayTwoPartOne {

    private DayTwoPartOne() {}

    public static int solvePartOne(String path) {
        return solvePartOne(readFileAsList(path));
    }

    static int solvePartOne(List<String> dataList) {
        if (dataList.isEmpty()) {
            return 0;
        }
        return new SimpleSubmarine(parse(dataList)).getSumValue();
    }
}