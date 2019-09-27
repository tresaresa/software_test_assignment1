package hotel;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ControllerTest {
    private Controller controller;

    @BeforeEach
    void initAll(){
        controller = new Controller();
    }

    @Test
    @DisplayName("adjust clocks via an AM beijing time")
    void adjustAMClocks() {
        controller.adjustClocks(10);
        assertEquals(10, controller.getConClock().getTime());
        CityClocks cityClocks = controller.getCityClocks();
        Clock beijing = cityClocks.getClockByName("beijing");
        assertNotNull(beijing);
        assertEquals(10, beijing.getTime(), "fail to adjust the clock of beijing");
        Clock new_york = cityClocks.getClockByName("new-york");
        assertNotNull(new_york);
        assertEquals(21, new_york.getTime(), "fail to adjust the clock of new-york");
        Clock moscow = cityClocks.getClockByName("moscow");
        assertNotNull(moscow);
        assertEquals(6, moscow.getTime(), "fail to adjust the clock of moscow");
        Clock london = cityClocks.getClockByName("london");
        assertNotNull(london);
        assertEquals(2, london.getTime(), "fail to adjust the clock of london");
        Clock sydney = cityClocks.getClockByName("sydney");
        assertNotNull(sydney);
        assertEquals(12, sydney.getTime(), "fail to adjust the clock of sydney");
    }

    @Test
    @DisplayName("adjust clocks via a PM beijing time")
    void adjustPMClocks() {
        controller.adjustClocks(23);
        assertEquals(23, controller.getConClock().getTime());
        CityClocks cityClocks = controller.getCityClocks();
        Clock beijing = cityClocks.getClockByName("beijing");
        assertNotNull(beijing);
        assertEquals(23, beijing.getTime());
        Clock new_york = cityClocks.getClockByName("new-york");
        assertNotNull(new_york);
        assertEquals(10, new_york.getTime());
        Clock moscow = cityClocks.getClockByName("moscow");
        assertNotNull(moscow);
        assertEquals(19, moscow.getTime());
        Clock london = cityClocks.getClockByName("london");
        assertNotNull(london);
        assertEquals(15, london.getTime());
        Clock sydney = cityClocks.getClockByName("sydney");
        assertNotNull(sydney);
        assertEquals(1, sydney.getTime());
    }
}