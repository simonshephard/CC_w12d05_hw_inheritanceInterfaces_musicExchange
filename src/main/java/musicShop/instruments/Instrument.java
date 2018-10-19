package musicShop.instruments;

import musicShop.interfaces.IPlay;
import musicShop.interfaces.ISell;

public abstract class Instrument implements ISell, IPlay {

    private InstrumentType instrumentType;
    private String material;
    private String colour;
    private String playSound;
    private double cost;
    private double price;

    public Instrument(InstrumentType instrumentType, String material, String colour, String playSound, double cost, double price) {
        this.instrumentType = instrumentType;
        this.material = material;
        this.colour = colour;
        this.playSound = playSound;
        this.cost = cost;
        this.price = price;
    }

    public InstrumentType getInstrumentType() {
        return instrumentType;
    }

    public String getMaterial() {
        return material;
    }

    public String getColour() {
        return colour;
    }

    public String play() {
        return this.playSound;
    }

    public double getCost() {
        return cost;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getMarkupPercent() {
        return (this.price / this.cost - 1) * 100;
    }

    public double getMarkupMoney() {
        return this.price - this.cost;
    }

}
