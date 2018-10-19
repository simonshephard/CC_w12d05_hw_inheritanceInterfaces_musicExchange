import musicShop.instruments.Guitar;
import musicShop.instruments.InstrumentType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {

    private Guitar guitar;

    @Before
    public void before() {
        guitar = new Guitar(InstrumentType.PERCUSSION, "Wood", "Maple", "StrumStrum", 50.00, 90.00, 6);
    }

    @Test
    public void getInstumentType() {
        assertEquals(InstrumentType.PERCUSSION, guitar.getInstrumentType());
    }

    @Test
    public void getMaterial() {
        assertEquals("Wood", guitar.getMaterial());
    }

    @Test
    public void getColour() {
        assertEquals("Maple", guitar.getColour());
    }

    @Test
    public void canPlay() {
        assertEquals("StrumStrum", guitar.play());
    }

    @Test
    public void getCost() {
        assertEquals(50.00, guitar.getCost(), 0.01);
    }

    @Test
    public void getPrice() {
        assertEquals(90.00, guitar.getPrice(), 0.01);
    }

    @Test
    public void setPrice() {
        guitar.setPrice(95.00);
        assertEquals(95.00, guitar.getPrice(), 0.01);
    }

    @Test
    public void getMarkUpPercent() {
        assertEquals(80.00, guitar.getMarkupPercent(), 0.01);
    }

    @Test
    public void getMarkUpMoney() {
        assertEquals(40.00, guitar.getMarkupMoney(), 0.01);
    }

    @Test
    public void getNumberStrings() {
        assertEquals(6, guitar.getNumberStrings());
    }

}
