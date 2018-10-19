package musicShop.accessories;

public class GuitarStrings extends Accessory {

    private int numberStrings;

    public GuitarStrings(String accessoryType, String material, String colour, double cost, double price, int numberStrings) {
        super(accessoryType, material, colour, cost, price);
        this.numberStrings = numberStrings;
    }

    public int getNumberStrings() {
        return numberStrings;
    }

}
