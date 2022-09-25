package classes;

public class Balls extends Toys{
    private String SportType;
    private String size;

    public Balls(int price, int weight, String maker, int quantity, String sportType, String size) {
        super(price, weight, maker, quantity);
        SportType = sportType;
        this.size = size;
    }

    public String getSportType() {
        return SportType;
    }

    public void setSportType(String sportType) {
        SportType = sportType;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Balls{" +
                "SportType='" + SportType + '\'' +
                ", size='" + size + '\'' +
                '}';
    }

    @Override
    public void makeNoise() {
        System.out.println("Oooooo!");
    }

    @Override
    public String fee(int price, int quantity) {
        return super.fee(price, quantity);
    }
}
