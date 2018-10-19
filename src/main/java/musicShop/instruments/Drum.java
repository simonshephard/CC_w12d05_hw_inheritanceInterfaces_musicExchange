package musicShop.instruments;

public class Drum extends Instrument {

    private String tone;

    public Drum(InstrumentType instrumentType, String material, String colour, String playSound, double cost, double price, String tone) {
        super(instrumentType, material, colour, playSound, cost, price);
        this.tone = tone;
    }

    public String getTone() {
        return tone;
    }

}
