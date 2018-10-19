import musicShop.instruments.Drum;
import musicShop.instruments.InstrumentType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DrumTest {

    private Drum drum;

    @Before
    public void before() {
        drum = new Drum(InstrumentType.PERCUSSION, "Metal", "Black", "TomTom", 35.99, 49.99, "A");
    }

    @Test
    public void getInstumentType() {
        assertEquals(InstrumentType.PERCUSSION, drum.getInstrumentType());
    }

    @Test
    public void getMaterial() {
        assertEquals("Metal", drum.getMaterial());
    }

    @Test
    public void getColour() {
        assertEquals("Black", drum.getColour());
    }

    @Test
    public void canPlay() {
        assertEquals("TomTom", drum.play());
    }

    @Test
    public void getCost() {
        assertEquals(35.99, drum.getCost(), 0.01);
    }

    @Test
    public void getPrice() {
        assertEquals(49.99, drum.getPrice(), 0.01);
    }

    @Test
    public void setPrice() {
        drum.setPrice(45.99);
        assertEquals(45.99, drum.getPrice(), 0.01);
    }

    @Test
    public void getMarkUpPercent() {
        assertEquals(38.90, drum.getMarkupPercent(), 0.01);
    }

    @Test
    public void getMarkUpMoney() {
        assertEquals(14.00, drum.getMarkupMoney(), 0.01);
    }

    @Test
    public void getTone() {
        assertEquals("A", drum.getTone());
    }

}
