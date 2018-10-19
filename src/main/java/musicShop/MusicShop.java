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

    private double getTotalCost() {
        double totalCost = 0.00;
        for (ISell item : stock) {
            totalCost += item.getCost();
        }
        return totalCost;
    }

    private double getTotalPrice() {
        double totalPrice = 0.00;
        for (ISell item : stock) {
            totalPrice += item.getPrice();
        }
        return totalPrice;
    }

    public double getTotalMarkupMoney() {
        return getTotalPrice() - getTotalCost();
    }

    public double getTotalMarkupPercent() {
        return (getTotalMarkupMoney() / getTotalCost()) * 100.00;
    }

}
