package org.example;

import java.util.List;

import static org.example.utils.DataReader.*;

public class DayTwoPartTwo {

    public static int solvePartTwo(String path) {
        return solvePartTwo(readFileAsList(path));
    }

    public static int solvePartTwo(List<String> dataList) {
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
        int aim = 0;
        for (Command command : commands) {
            switch (command.getDirection()) {
                case "forward" -> {
                    forwardValue += command.getValue();
                    depthValue += aim * command.getValue();
                }
                case "up" -> aim -= command.getValue();
                case "down" -> aim += command.getValue();
                default -> System.out.println("unknown instruction: " + command.getDirection());
            }
        }
        return forwardValue * depthValue;
    }
}