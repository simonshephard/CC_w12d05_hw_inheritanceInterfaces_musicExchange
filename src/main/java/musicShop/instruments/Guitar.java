package musicShop.instruments;

public class Guitar extends Instrument {

    private int numberStrings;

    public Guitar(InstrumentType instrumentType, String material, String colour, String playSound, double cost, double price, int numberStrings) {
        super(instrumentType, material, colour, playSound, cost, price);
        this.numberStrings = numberStrings;
    }

    public int getNumberStrings() {
        return numberStrings;
    }

}
