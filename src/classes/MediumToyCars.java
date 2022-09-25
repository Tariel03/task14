package classes;

public class MediumToyCars extends SmallToyCars {
    private final String size = "medium";

    public MediumToyCars(int price, int weight, String maker, int quantity, String model) {
        super(price, weight, maker, quantity, model);
    }

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
        return "MediumToyCars{" +
                "size='" + size + '\'' +
                '}';
    }
}
