package org.example;

import java.util.List;

import static org.example.utils.DataReader.*;

public class DayTwoPartOne {

    public static int solvePartOne(String path) {
        return solvePartOne(readFileAsList(path));
    }
    public static int solvePartOne2(String path) {
        return solvePartOne2(readFileAsList(path));
    }

    static int solvePartOne(List<String> dataList) {
        if (dataList.isEmpty()) {
            return 0;
        }
        return new Submarine(parse(dataList)).getSumValue();
    }
    static int solvePartOne2(List<String> dataList) {
        if (dataList.isEmpty()) {
            return 0;
        }
        return calculate(parse(dataList));
    }

    private static List<Command> parse(List<String> dataList) {
        return dataList.stream().map(Command::validInput).toList();
    }

    private static int calculate(List<Command> commands) {
        int forwardValue = 0;
        int depthValue = 0;

        for (Command command : commands) {
            switch (command.getDirection()) {
                case "forward" -> forwardValue += command.getValue();
                case "up" -> depthValue -= command.getValue();
                case "down" -> depthValue += command.getValue();
                default -> System.out.println("unknown instruction: " + command.getDirection());
            }
        }
        return forwardValue * depthValue;
    }
}