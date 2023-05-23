import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class PartTwo {

    public static void main(String[] args) throws IOException {

        String testdata = """
                199
                200
                208
                210
                200
                207
                240
                269
                260
                263""";

        int increased = 0;

        BufferedReader br = new BufferedReader(new FileReader("src/main/resources/input.txt"));

        List<Integer> dataList = (br.lines().map(Integer::parseInt).toList());
//        List<Integer> dataList = Arrays.stream(testdata.split("\n")).map(Integer::parseInt).toList();

        int prevWindow = 0;
        for (int i = 1; i < dataList.size() - 1; i++) {
            int currentWindow = dataList.get(i - 1) + dataList.get(i) + dataList.get(i + 1);

            if (prevWindow == 0) {
                prevWindow = currentWindow;
            }

            if (compare(prevWindow, currentWindow)) {
                increased++;
            }
            prevWindow = currentWindow;
        }
        System.out.println(increased);
    }
    private static boolean compare(Integer prev, Integer current) {
        return prev < current;
    }
}