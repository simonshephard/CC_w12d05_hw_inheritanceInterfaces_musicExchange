import musicShop.instruments.InstrumentType;
import musicShop.instruments.Trombone;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TromboneTest {

    private Trombone trombone;

    @Before
    public void before() {
        trombone = new Trombone(InstrumentType.BRASS, "Brass", "DeepYellow", "PaaaaaarpPaaaaarp", 80.00, 120.00, "Bass");
    }

    @Test
    public void getInstumentType() {
        assertEquals(InstrumentType.BRASS, trombone.getInstrumentType());
    }

    @Test
    public void getMaterial() {
        assertEquals("Brass", trombone.getMaterial());
    }

    @Test
    public void getColour() {
        assertEquals("DeepYellow", trombone.getColour());
    }

    @Test
    public void canPlay() {
        assertEquals("PaaaaaarpPaaaaarp", trombone.play());
    }

    @Test
    public void getCost() {
        assertEquals(80.00, trombone.getCost(), 0.01);
    }

    @Test
    public void getPrice() {
        assertEquals(120.00, trombone.getPrice(), 0.01);
    }

    @Test
    public void setPrice() {
        trombone.setPrice(140.00);
        assertEquals(140.00, trombone.getPrice(), 0.01);
    }

    @Test
    public void getMarkUpPercent() {
        assertEquals(50.00, trombone.getMarkupPercent(), 0.01);
    }

    @Test
    public void getMarkUpMoney() {
        assertEquals(40.00, trombone.getMarkupMoney(), 0.01);
    }

    @Test
    public void getNumberStrings() {
        assertEquals("Bass", trombone.getVariant());
    }

}
