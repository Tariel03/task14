package classes;

import java.util.Objects;

public class Dolls extends Toys{
    private String size;
    private String ageRange;

    @Override
    public String toString() {
        return "Dolls{" +
                "size='" + size + '\'' +
                ", ageRange='" + ageRange + '\'' +
                '}';
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getAgeRange() {
        return ageRange;
    }

    public void setAgeRange(String ageRange) {
        this.ageRange = ageRange;
    }

    public Dolls(int price, int weight, String maker, int quantity, String size, String ageRange) {
        super(price, weight, maker, quantity);
        this.size = size;
        this.ageRange = ageRange;
    }

    @Override
    public void makeNoise() {
        System.out.println("Play with me!");
    }

    @Override
    public String fee(int price, int quantity) {
        return super.fee(price, quantity);
    }
}
