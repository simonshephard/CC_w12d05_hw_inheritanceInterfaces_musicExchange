package musicShop.accessories;

import musicShop.interfaces.ISell;

public abstract class Accessory implements ISell {

    private String accessoryType;
    private String material;
    private String colour;
    private double cost;
    private double price;

    public Accessory(String accessoryType, String material, String colour, double cost, double price) {
        this.accessoryType = accessoryType;
        this.material = material;
        this.colour = colour;
        this.cost = cost;
        this.price = price;

    }

    public String getAccessoryType() {
        return accessoryType;
    }

    public String getMaterial() {
        return material;
    }

    public String getColour() {
        return colour;
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
