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

    public ArrayList<ISell> getStock() {
        return stock;
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

    public double getTotalMarkupMoneyUsingItemMethod() {
        double totalMarkupMoney = 0.00;
        for (ISell item : stock) {
            totalMarkupMoney += item.getMarkupMoney();
        }
        return totalMarkupMoney;
    }

    public void sortStockByPrice() {
        sort(this.stock, 0, this.stock.size()-1);
    }


    // sort method recursively partitions and sorts by price
    private void sort(ArrayList<ISell> stock, int lowIndex, int highIndex) {
        if (lowIndex < highIndex) {
            int partitionIndex = partition(stock, lowIndex, highIndex);
            sort(stock, lowIndex, partitionIndex-1);
            sort(stock, partitionIndex+1, highIndex);
        }
    }

    // partition method partitions ArrayList around pivot (last) item
    // and returns resulting index of pivot
    private int partition(ArrayList<ISell> stock, int lowIndex, int highIndex) {

        double pivotPrice = stock.get(highIndex).getPrice();
        int i = (lowIndex-1);
        for (int j = lowIndex; j < highIndex; j++) {
            if (stock.get(j).getPrice() <= pivotPrice) {
                i++;
                ISell temp = stock.get(i);
                stock.set(i, stock.get(j));
                stock.set(j, temp);
            }
        }

        ISell temp = stock.get(i+1);
        stock.set(i+1, stock.get(highIndex));
        stock.set(highIndex, temp);

        return i+1;
    }




}
