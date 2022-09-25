package classes;

public class BigToyCars extends SmallToyCars {
    private final String size = "medium";

    @Override
    public void makeNoise() {
        super.makeNoise();
    }

    @Override
    public String fee(int price, int quantity) {
        return super.fee(price, quantity);
    }

    @Override
    public String toString() {
        return "BigToyCars{" +
                "size='" + size + '\'' +
                '}';
    }

    public BigToyCars(int price, int weight, String maker, int quantity, String model) {
        super(price, weight, maker, quantity, model);
    }
}
