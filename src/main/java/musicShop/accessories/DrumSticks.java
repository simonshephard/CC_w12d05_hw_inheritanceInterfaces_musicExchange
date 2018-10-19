package musicShop.accessories;

public class DrumSticks extends Accessory {

    private int numberSticks;

    public DrumSticks(String accessoryType, String material, String colour, double cost, double price, int numberSticks) {
        super(accessoryType, material, colour, cost, price);
        this.numberSticks = numberSticks;
    }

    public int getNumberSticks() {
        return numberSticks;
    }

}
