package org.example;

import java.util.List;

class PartTwo {

    private PartTwo() {
    }

    public static int runPartTwo(String path) {

        List<Integer> dataList = DataReader.getDataAsIntegersList(path);
        final int windowSize = 3;
        int increased = 0;
        int prevWindow = 0;
        if (!dataList.isEmpty() && dataList.size() >= windowSize) {
            for (int j = 0; j < windowSize; j++)  {
                prevWindow += dataList.get(j);
            }
            for (int i = windowSize; i < dataList.size(); i++) {
                int currentWindow = prevWindow + dataList.get(i) - dataList.get(i - windowSize);

                if (currentWindow > prevWindow) {
                    increased++;
                }
                prevWindow = currentWindow;
            }
        }
        return increased;
    }
}