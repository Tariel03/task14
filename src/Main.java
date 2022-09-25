import classes.*;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.SortedMap;

import static java.lang.System.in;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("Добро пожаловать в нашу игровую комнату! \nДля ребенка какого возраста вам нужна комната(1-4,4-7,7+)"+"\nДля ребенка возрастом(1-4) нажмите 1, для возраста(4-7) нажмите и 3 для детей старше 7 лет");
        Scanner scanner = new Scanner(in);
        int age = scanner.nextInt();
        System.out.println(12);
        while(1<=age && age<=3) {
            if (age == 1) {
                System.out.println("В какую цену вы хотите уложится?");
                int price = scanner.nextInt();

                break;

            } else if (age == 2) {

            } else if (age == 3) {

            } else {
                System.out.println("Введите число от 1 до 3 включительно");
            }
        }


    }

    public static Balls getBalls (){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Сколько мячей вы хотите?");
        int quantity = scanner.nextInt();
        System.out.println("Какого типа мяч вы хотите?");
        scanner.nextLine();
        String sportType = scanner.nextLine();
        System.out.println("Какого размера мяч вы хотите?");
        String size = scanner.nextLine();

        Balls balls = new Balls(200,50,"China",quantity,sportType,"big");
        return balls;
    }

    public static SmallToyCars getSmallToyCars (){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Сколько маленьких машинок вы хотите вы хотите?");
        int quantity = scanner.nextInt();
        System.out.println("Каую модель машины вы хотите вы хотите?");
        scanner.nextLine();
        String Type = scanner.nextLine();
        SmallToyCars smallToyCars = new SmallToyCars(200,50,"China",quantity,Type);
        return smallToyCars;
    }
    public static MediumToyCars getMediumToyCars (){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Сколько маленьких машинок вы хотите вы хотите?");
        int quantity = scanner.nextInt();
        System.out.println("Каую модель машины вы хотите вы хотите?");
        scanner.nextLine();
        String Type = scanner.nextLine();
        MediumToyCars mediumToyCars = new MediumToyCars(200,50,"China",quantity,Type);
        return mediumToyCars;
    }

    public static BigToyCars getBigToyCars (){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Сколько маленьких машинок вы хотите вы хотите?");
        int quantity = scanner.nextInt();
        System.out.println("Каую модель машины вы хотите вы хотите?");
        scanner.nextLine();
        String Type = scanner.nextLine();
        BigToyCars bigToyCars = new BigToyCars(200,50,"China",quantity,Type);
        return bigToyCars;
    }
    public static Cubes getCubes (){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Сколько маленьких машинок вы хотите вы хотите?");
        int quantity = scanner.nextInt();
        System.out.println("Какую модель кубика вы хотите вы хотите?");
        scanner.nextLine();
        String Type = scanner.nextLine();
        Cubes cubes = new Cubes(150,100,"Ireland",quantity,Type);
        return cubes;
    }

    public static void BallsWriter(Balls balls) throws IOException {
        File file = new File("/home/iskender/Tariel/task14/src/text/tar.txt");
        FileWriter fileWriter = new FileWriter(file);
        fileWriter.write(""+balls.getPrice()+" "+balls.getWeight()+" "+balls.getMaker() +" "+ balls.getQuantity()+" "+balls.getSportType()+" "+balls.getSize()+"\n");
        fileWriter.close();
    }
    public static void CubesWriter(Cubes cubes) throws IOException {
        File file = new File("/home/iskender/Tariel/task14/src/text/tar.txt");
        FileWriter fileWriter = new FileWriter(file);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        fileWriter.write(cubes.getPrice()+" "+cubes.getWeight()+" "+cubes.getMaker() +" "+ cubes.getQuantity()+" "+cubes.getTypeOfCube()+"\n");
        fileWriter.close();
    }
    public static void DollsWriter(Dolls dolls) throws IOException {
        File file = new File("/home/iskender/Tariel/task14/src/text/tar.txt");
        FileWriter fileWriter = new FileWriter(file);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        fileWriter.write(dolls.getPrice()+" "+dolls.getWeight()+" "+dolls.getMaker() +" "+ dolls.getQuantity()+" "+dolls.getSize()+" "+dolls.getAgeRange()+"\n");
        fileWriter.close();
    }
    public static void SmallToyCarsWriter(SmallToyCars smallToyCars) throws IOException {
        File file = new File("/home/iskender/Tariel/task14/src/text/tar.txt");
        FileWriter fileWriter = new FileWriter(file);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        fileWriter.write(smallToyCars.getPrice()+" "+smallToyCars.getWeight()+" "+smallToyCars.getMaker() +" "+ smallToyCars.getQuantity()+" "+smallToyCars.getModel()+"\n");
        fileWriter.close();
    }
    public static void MediumToyCarsWriter(MediumToyCars mediumToyCars) throws IOException {
        File file = new File("/home/iskender/Tariel/task14/src/text/tar.txt");
        FileWriter fileWriter = new FileWriter(file);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        fileWriter.write(mediumToyCars.getPrice()+" "+mediumToyCars.getWeight()+" "+mediumToyCars.getMaker() +" "+ mediumToyCars.getQuantity()+" "+mediumToyCars.getModel()+"\n");
        fileWriter.close();
    }

    public static void BigToyCarsWriter(BigToyCars bigToyCars) throws IOException {
        File file = new File("/home/iskender/Tariel/task14/src/text/tar.txt");
        FileWriter fileWriter = new FileWriter(file);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        fileWriter.write(bigToyCars.getPrice()+" "+bigToyCars.getWeight()+" "+bigToyCars.getMaker() +" "+ bigToyCars.getQuantity()+" "+bigToyCars.getModel()+"\n");
        fileWriter.close();
    }

}