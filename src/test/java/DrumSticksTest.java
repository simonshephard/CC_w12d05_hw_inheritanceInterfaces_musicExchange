import musicShop.accessories.DrumSticks;
import musicShop.instruments.InstrumentType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DrumSticksTest {

    private DrumSticks drumSticks;

    @Before
    public void before() {
        drumSticks = new DrumSticks("Standard4Pack", "Wood", "White", 10.99, 21.95, 4);
    }

    @Test
    public void getInstumentType() {
        assertEquals("Standard4Pack", drumSticks.getAccessoryType());
    }

    @Test
    public void getMaterial() {
        assertEquals("Wood", drumSticks.getMaterial());
    }

    @Test
    public void getColour() {
        assertEquals("White", drumSticks.getColour());
    }

    @Test
    public void getCost() {
        assertEquals(10.99, drumSticks.getCost(), 0.01);
    }

    @Test
    public void getPrice() {
        assertEquals(21.95, drumSticks.getPrice(), 0.01);
    }

    @Test
    public void setPrice() {
        drumSticks.setPrice(25.99);
        assertEquals(25.99, drumSticks.getPrice(), 0.01);
    }

    @Test
    public void getMarkUpPercent() {
        assertEquals(99.73, drumSticks.getMarkupPercent(), 0.01);
    }

    @Test
    public void getMarkUpMoney() {
        assertEquals(10.96, drumSticks.getMarkupMoney(), 0.01);
    }

    @Test
    public void getNumberSticks() {
        assertEquals(4, drumSticks.getNumberSticks());
    }

}
