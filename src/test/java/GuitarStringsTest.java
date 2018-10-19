import musicShop.accessories.GuitarStrings;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarStringsTest {

    private GuitarStrings guitarStrings;

    @Before
    public void before() {
        guitarStrings = new GuitarStrings("StandardElectric", "Steel", "Silver", 3.99, 7.99, 6);
    }

    @Test
    public void getInstumentType() {
        assertEquals("StandardElectric", guitarStrings.getAccessoryType());
    }

    @Test
    public void getMaterial() {
        assertEquals("Steel", guitarStrings.getMaterial());
    }

    @Test
    public void getColour() {
        assertEquals("Silver", guitarStrings.getColour());
    }

    @Test
    public void getCost() {
        assertEquals(3.99, guitarStrings.getCost(), 0.01);
    }

    @Test
    public void getPrice() {
        assertEquals(7.99, guitarStrings.getPrice(), 0.01);
    }

    @Test
    public void setPrice() {
        guitarStrings.setPrice(8.50);
        assertEquals(8.50, guitarStrings.getPrice(), 0.01);
    }

    @Test
    public void getMarkUpPercent() {
        assertEquals(100.25, guitarStrings.getMarkupPercent(), 0.01);
    }

    @Test
    public void getMarkUpMoney() {
        assertEquals(4.00, guitarStrings.getMarkupMoney(), 0.01);
    }

    @Test
    public void getNumberStrings() {
        assertEquals(6, guitarStrings.getNumberStrings());
    }

}
