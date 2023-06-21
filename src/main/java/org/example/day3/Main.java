package org.example.day3;

import org.example.common.utils.DataReader;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        String testData = """
                00100
                11110
                10110
                10111
                10101
                01111
                00111
                11100
                10000
                11001
                00010
                01010
                """;

        StringBuilder gamma = new StringBuilder();
        StringBuilder epsilon = new StringBuilder();

        List<String> diagnosticReport = DataReader.readFileAsList("src/main/resources/day3/input.txt"); // 3813416
//        List<String> diagnosticReport = testData.lines().toList();

        for (int i = 0; i < diagnosticReport.get(0).length(); i++) {
            int zeros = 0;
            int ones = 0;
            for (String s : diagnosticReport) {
                if (s.charAt(i) == '0') {
                    zeros++;
                } else {
                    ones++;
                }
            }
            if (ones > zeros) {
                gamma.append("1");
                epsilon.append("0");
            } else {
                gamma.append("0");
                epsilon.append("1");
            }
        }
        System.out.println(convert(gamma) * convert(epsilon));
    }

    private static int convert(StringBuilder data) {
        int convertedData = 0;
        for (char c : data.toString().toCharArray()) {
            convertedData = c == '0' ? convertedData << 1 : convertedData << 1 | 1;
        }
        return convertedData;
    }
}