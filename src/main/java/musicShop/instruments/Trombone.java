package musicShop.instruments;

public class Trombone extends Instrument {

    private String variant;

    public Trombone(InstrumentType instrumentType, String material, String colour, String playSound, double cost, double price, String variant) {
        super(instrumentType, material, colour, playSound, cost, price);
        this.variant = variant;
    }

    public String getVariant() {
        return variant;
    }

}
