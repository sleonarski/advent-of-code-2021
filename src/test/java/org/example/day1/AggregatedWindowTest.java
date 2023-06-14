package org.example.day1;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;
import org.junit.jupiter.api.Test;

class AggregatedWindowTest {

    private static final List<Integer> TEST_DATA = List.of(199, 200, 208, 210, 200, 207, 240, 269, 260, 263);
    private static final int WINDOW_SIZE = 3;

    @Test
    void shouldAddNextNumber() {
        //given
        AggregatedWindow aggregatedWindow = new AggregatedWindow(WINDOW_SIZE);
        for (int i = 0; i < TEST_DATA.size(); i++) {
        aggregatedWindow.nextNumber(TEST_DATA.get(i));
        }

        //when
        int  count = aggregatedWindow.getCount();

        //then
        assertEquals(5, count);
    }
}