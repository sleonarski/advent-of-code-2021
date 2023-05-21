import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

public class Solution {

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

        for (int i = 0; i < dataList.size() - 1; i++) {

            if (compare(dataList.get(i), dataList.get(i + 1))) {
                increased++;
            }
        }
        System.out.println(increased);
    }
    private static boolean compare(Integer integer1, Integer integer2) {
        return integer1 < integer2;
    }
}