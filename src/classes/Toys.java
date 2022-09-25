package classes;

public class Toys {
    private int price;
    private int weight;
    private int quantity;
    private String maker;

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Toys(int price, int weight, String maker, int quantity) {
        this.price = price;
        this.weight = weight;
        this.maker = maker;
        this.quantity = quantity;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getMaker() {
        return maker;
    }

    public void setMaker(String maker) {
        this.maker = maker;
    }

    @Override
    public String toString() {
        return "Toys{" +
                "price=" + price +
                ", weight=" + weight +
                ", quantity=" + quantity +
                ", maker='" + maker + '\'' +
                '}';
    }

    public void makeNoise(){
    }
    public String fee(int price,int quantity){
        return "Fee = "+ price*quantity;
    }
}



