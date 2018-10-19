import musicShop.MusicShop;
import musicShop.accessories.GuitarStrings;
import musicShop.instruments.Guitar;
import musicShop.instruments.InstrumentType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MusicShopTest {

    private MusicShop musicShop;
    private Guitar guitar;
    private GuitarStrings guitarStrings;

    @Before
    public void before() {
        musicShop = new MusicShop("MusicOne");
        guitar = new Guitar(InstrumentType.PERCUSSION, "Wood", "Maple", "StrumStrum", 50.00, 90.00, 6);
        guitarStrings = new GuitarStrings("StandardElectric", "Steel", "Silver", 3.99, 7.99, 6);
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

    @Test
    public void getTotalMarkupMoney() {
        musicShop.addStock(guitar);
        musicShop.addStock(guitarStrings);
        assertEquals(44.00, musicShop.getTotalMarkupMoney(), 0.01);
    }

    @Test
    public void getTotalMarkupPercent() {
        musicShop.addStock(guitar);
        musicShop.addStock(guitarStrings);
        assertEquals(81.50, musicShop.getTotalMarkupPercent(), 0.01);
    }

    @Test
    public void getTotalMarkupMoneyUsingItemMethod() {
        musicShop.addStock(guitar);
        musicShop.addStock(guitarStrings);
        assertEquals(44.00, musicShop.getTotalMarkupMoneyUsingItemMethod(), 0.01);
    }


}
