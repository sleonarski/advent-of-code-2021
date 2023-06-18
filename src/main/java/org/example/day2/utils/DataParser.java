package org.example.day2.utils;

import org.example.day2.Command;

import java.util.List;

public class DataParser {
    public static List<Command> parse(List<String> dataList) {
        return dataList.stream().map(Command::validInput).toList();
    }
}