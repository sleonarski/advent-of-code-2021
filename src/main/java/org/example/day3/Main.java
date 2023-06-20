package org.example.day3;

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

        var gamma = 0L;
        var epsilon = 0L;

        List<String> diagnosticReport = testData.lines().toList();

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
            if (zeros > ones) {
                gamma <<= 1;     // + 0
                epsilon = (epsilon << 1) | 1; // + 1
            } else {
                gamma = (gamma << 1) | 1;
                epsilon <<= 1;
            }
        }
        System.out.println(String.valueOf(gamma * epsilon));
    }

}
