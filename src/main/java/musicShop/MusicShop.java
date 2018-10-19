package musicShop;

import musicShop.interfaces.ISell;

import java.util.ArrayList;

public class MusicShop {

    private String name;
    private ArrayList<ISell> stock;

    public MusicShop(String name) {
        this.name = name;
        this.stock = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public int stockCount() {
        return this.stock.size();
    }

    public void addStock(ISell stockItem) {
        this.stock.add(stockItem);
    }

    public void removeStock(ISell stockItem) {
        this.stock.remove(stockItem);
    }

}
