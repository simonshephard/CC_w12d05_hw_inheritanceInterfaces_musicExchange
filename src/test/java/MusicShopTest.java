import musicShop.MusicShop;
import musicShop.instruments.Guitar;
import musicShop.instruments.InstrumentType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MusicShopTest {

    private MusicShop musicShop;
    private Guitar guitar;

    @Before
    public void before() {
        musicShop = new MusicShop("MusicOne");
        guitar = new Guitar(InstrumentType.PERCUSSION, "Wood", "Maple", "StrumStrum", 50.00, 90.00, 6);
    }

    @Test
    public void getName() {
        assertEquals("MusicOne", musicShop.getName());
    }

    @Test
    public void stockCount() {
        assertEquals(0, musicShop.stockCount());
    }

    @Test
    public void addStock() {
        musicShop.addStock(guitar);
        assertEquals(1, musicShop.stockCount());
    }

    @Test
    public void removeStock() {
        musicShop.addStock(guitar);
        musicShop.removeStock(guitar);
        assertEquals(0, musicShop.stockCount());
    }


}
