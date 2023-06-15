package org.example.day3;

import static java.lang.Integer.*;
import static java.lang.String.join;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import org.example.common.utils.DataReader;

public class Main {

    public static void main(String[] args) {

        String testData = """
                001000
                111101
                101102
                101113
                101014
                011115
                001116
                111007
                100008
                110019
                000100
                010101
                """;

        List<String> diagnosticReport = testData.lines().toList();

        diagnosticReport.forEach(d -> System.out.println(d));

        List<Integer> parsedReport = new ArrayList<>();
        for (String report : diagnosticReport) {
            List<Integer> temporatyField = new ArrayList<>();
            String[] splittedReportData = report.split("");

            for (int i = 0; i < report; i++) {
                parsedReport.add(i);
            }
        }

    }
}
