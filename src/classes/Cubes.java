package classes;

public class Cubes extends Toys{
    String typeOfCube;

    private final String name = "Cubes";
    public String getName() {
        return name;
    }

    public String getTypeOfCube() {
        return typeOfCube;
    }

    public void setTypeOfCube(String typeOfCube) {
        this.typeOfCube = typeOfCube;
    }

    @Override
    public String fee(int price, int quantity) {
        return super.fee(price, quantity);
    }

    @Override
    public String toString() {
        return "Cubes{" +
                "typeOfCube='" + typeOfCube + '\'' +
                '}';
    }


    public Cubes(int price, int weight, String maker, int quantity, String typeOfCube) {
        super(price, weight, maker, quantity);
        this.typeOfCube = typeOfCube;
    }
}
