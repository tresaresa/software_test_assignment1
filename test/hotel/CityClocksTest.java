package hotel;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CityClocksTest {
    private CityClocks cityClocks;

    @BeforeEach
    void init(){
        cityClocks = new CityClocks();
    }

    @Test
    @DisplayName("get the clock of beijing")
    void getBeijingClockByName() {
        Clock beijing = cityClocks.getClockByName("beijing");
        assertEquals("beijing", beijing.getName());
    }

    @Test
    @DisplayName("get the clock of new-york")
    void getNewYorkClockByName() {
        Clock beijing = cityClocks.getClockByName("new-york");
        assertEquals("new-york", beijing.getName());
    }

    @Test
    @DisplayName("get the clock of moscow")
    void getMoscowClockByName() {
        Clock beijing = cityClocks.getClockByName("moscow");
        assertEquals("moscow", beijing.getName());
    }

    @Test
    @DisplayName("get the clock of london")
    void getLondonClockByName() {
        Clock beijing = cityClocks.getClockByName("london");
        assertEquals("london", beijing.getName());
    }

    @Test
    @DisplayName("get the clock of sydney")
    void getSydneyClockByName() {
        Clock beijing = cityClocks.getClockByName("sydney");
        assertEquals("sydney", beijing.getName());
    }
}