import musicShop.MusicShop;
import musicShop.QuickSort;
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

    @Test
    public void sortStock() {

        Guitar guitar1 = new Guitar(InstrumentType.PERCUSSION, "Wood", "Maple", "StrumStrum", 51.55, 65.55, 6);
        Guitar guitar2 = new Guitar(InstrumentType.PERCUSSION, "Wood", "Maple", "StrumStrum", 51.55, 55.55, 6);
        Guitar guitar3 = new Guitar(InstrumentType.PERCUSSION, "Wood", "Maple", "StrumStrum", 51.55, 45.55, 6);
        Guitar guitar4 = new Guitar(InstrumentType.PERCUSSION, "Wood", "Maple", "StrumStrum", 51.55, 35.55, 6);
        Guitar guitar5 = new Guitar(InstrumentType.PERCUSSION, "Wood", "Maple", "StrumStrum", 51.55, 25.55, 6);
        GuitarStrings guitarStrings1 = new GuitarStrings("StandardElectric", "Steel", "Silver", 1.99, 59.99, 6);
        GuitarStrings guitarStrings2 = new GuitarStrings("StandardElectric", "Steel", "Silver", 1.99, 49.99, 6);
        GuitarStrings guitarStrings3 = new GuitarStrings("StandardElectric", "Steel", "Silver", 1.99, 39.99, 6);
        GuitarStrings guitarStrings4 = new GuitarStrings("StandardElectric", "Steel", "Silver", 1.99, 29.99, 6);
        GuitarStrings guitarStrings5 = new GuitarStrings("StandardElectric", "Steel", "Silver", 1.99, 19.99, 6);
        musicShop.addStock(guitar1);
        musicShop.addStock(guitar2);
        musicShop.addStock(guitar3);
        musicShop.addStock(guitar4);
        musicShop.addStock(guitar5);
        musicShop.addStock(guitarStrings1);
        musicShop.addStock(guitarStrings2);
        musicShop.addStock(guitarStrings3);
        musicShop.addStock(guitarStrings4);
        musicShop.addStock(guitarStrings5);

        assertEquals(guitar1, musicShop.getStock().get(0));
        assertEquals(guitar2, musicShop.getStock().get(1));
        assertEquals(guitar3, musicShop.getStock().get(2));
        assertEquals(guitar4, musicShop.getStock().get(3));
        assertEquals(guitar5, musicShop.getStock().get(4));
        assertEquals(guitarStrings1, musicShop.getStock().get(5));
        assertEquals(guitarStrings2, musicShop.getStock().get(6));
        assertEquals(guitarStrings3, musicShop.getStock().get(7));
        assertEquals(guitarStrings4, musicShop.getStock().get(8));
        assertEquals(guitarStrings5, musicShop.getStock().get(9));

        musicShop.sortStockByPrice();

        assertEquals(guitarStrings5, musicShop.getStock().get(0));
        assertEquals(guitar5, musicShop.getStock().get(1));
        assertEquals(guitarStrings4, musicShop.getStock().get(2));
        assertEquals(guitar4, musicShop.getStock().get(3));
        assertEquals(guitarStrings3, musicShop.getStock().get(4));
        assertEquals(guitar3, musicShop.getStock().get(5));
        assertEquals(guitarStrings2, musicShop.getStock().get(6));
        assertEquals(guitar2, musicShop.getStock().get(7));
        assertEquals(guitarStrings1, musicShop.getStock().get(8));
        assertEquals(guitar1, musicShop.getStock().get(9));

    }

}
