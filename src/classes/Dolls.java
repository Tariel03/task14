package classes;

import java.util.Objects;

public class Dolls extends Toys{
    private String size;

    public String getName() {
        return name;
    }

    private final String name = "Dolls";

    @Override
    public String toString() {
        return "Dolls{" +
                "size='" + size + '\'' +
                '}';
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }



    public Dolls(int price, int weight, String maker, int quantity, String size) {
        super(price, weight, maker, quantity);
        this.size = size;
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
