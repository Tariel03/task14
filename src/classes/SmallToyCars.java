package classes;

public class SmallToyCars extends Toys {
    private String model;
    private final String size = "small";

    public SmallToyCars(int price, int weight, String maker, int quantity, String model) {
        super(price, weight, maker, quantity);
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getSize() {
        return size;
    }

    @Override
    public String toString() {
        return "ToyCars{" +
                " model='" + model + '\'' +
                '}';
    }

    @Override
    public void makeNoise() {
        System.out.println("Beep-beep");
    }

    @Override
    public String fee(int price, int quantity) {
        return super.fee(price, quantity);
    }


}

