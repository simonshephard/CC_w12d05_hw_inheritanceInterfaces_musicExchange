package musicShop;

import musicShop.interfaces.ISell;
import java.util.ArrayList;

public class QuickSort {

    // sort method recursively partitions and sorts by price
    public void sort(ArrayList<ISell> stock, int lowIndex, int highIndex) {
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
