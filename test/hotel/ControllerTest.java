package hotel;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class ControllerTest {

    @Test
    void adjustAMClocks() {
        Controller controller = new Controller();
        controller.adjustClocks(10);
        assertEquals(10, controller.getConClock().getTime());
        CityClocks cityClocks = controller.getCityClocks();
        assertEquals(21, cityClocks.getClockByName("new-york"));
        assertEquals(2, cityClocks.getClockByName("london"));
        assertEquals(6, cityClocks.getClockByName("moscow"));
        assertEquals(10, cityClocks.getClockByName("beijing"));
        assertEquals(12, cityClocks.getClockByName("sydney"));
    }
}