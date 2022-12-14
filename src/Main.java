import classes.*;

import java.io.*;
import java.util.*;

import static java.lang.System.in;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("Добро пожаловать в нашу игровую комнату! \nДля ребенка какого возраста вам нужна комната(1-4,4-7,7+)"+"\nДля ребенка возрастом(1-4) нажмите 1, для возраста(4-7) нажмите и 3 для детей старше 7 лет");
        Scanner scanner = new Scanner(in);
        int age = scanner.nextInt();
        while(1<=age && age<=3) {
            String [][] room = new String[6][2];
            if (age == 1) {
                System.out.println("В какую цену вы хотите уложится?");
                int price = scanner.nextInt();
                choice(price);
                break;
            } else if (age == 2) {
                System.out.println("В какую цену вы хотите уложится?");
                int price = scanner.nextInt();
                choice(price);
                break;
            } else if (age == 3) {
                System.out.println("В какую цену вы хотите уложится?");
                int price = scanner.nextInt();
                choice(price);
                break;
            } else {
                System.out.println("Введите число от 1 до 3 включительно");
            }
        }
        fileReader(new File("/home/iskender/Tariel/task14/src/text/tar.txt"));



    }

    static String[][] sorter(String[][]a){
        Arrays.sort(a, Comparator.comparingDouble(o -> Double.parseDouble(o[4])));
        return a;
    }


    public static int choice(int total) throws IOException {
        Scanner scanner = new Scanner(System.in);
        while (total>=0) {
            System.out.println("Вы хотите добавить мячи?");
            if (scanner.nextLine().equals("yes")) {
                Balls balls = getBalls();
                total -= balls.getPrice() * balls.getQuantity();
                System.out.println("Ваш остаток равен - "+total);
                BallsWriter(balls);
            }
            System.out.println("Вы хотите добавить кубики?");
            if (scanner.nextLine().equals("yes")) {
                Cubes cubes = getCubes();
                total -= cubes.getPrice() * cubes.getQuantity();
                System.out.println("Ваш остаток равен - "+total);
                CubesWriter(cubes);
            }
            System.out.println("Вы хотите добавить куклы?");
            if (scanner.nextLine().equals("yes")) {
                Dolls dolls = getDolls();
                total -= dolls.getPrice() * dolls.getQuantity();
                System.out.println("Ваш остаток равен - "+total);
                DollsWriter(dolls);

            }
            System.out.println("Вы хотите добавить средние машинки?");
            if (scanner.nextLine().equals("yes")) {
                MediumToyCars mediumToyCars = getMediumToyCars();
                total -= mediumToyCars.getPrice() * mediumToyCars.getQuantity();
                System.out.println("Ваш остаток равен - "+total);
                MediumToyCarsWriter(mediumToyCars);

            }
            System.out.println("Вы хотите добавить маленькие машинки?");
            if (scanner.nextLine().equals("yes")) {
                SmallToyCars smallToyCars = getSmallToyCars();
                total -= smallToyCars.getPrice() * smallToyCars.getQuantity();
                System.out.println("Ваш остаток равен - "+total);
                SmallToyCarsWriter(smallToyCars);

            }
            System.out.println("Вы хотите добавить большие машинки?");
            if (scanner.nextLine().equals("yes")) {
                BigToyCars bigToyCars = getBigToyCars();
                total -= bigToyCars.getPrice() * bigToyCars.getQuantity();
                System.out.println("Ваш остаток равен - "+total);
                BigToyCarsWriter(bigToyCars);


            }
        }
        return total;
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
        SmallToyCars smallToyCars = new SmallToyCars(300,50,"China",quantity,Type);
        return smallToyCars;
    }
    public static MediumToyCars getMediumToyCars (){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Сколько маленьких машинок вы хотите?");
        int quantity = scanner.nextInt();
        System.out.println("Каую модель машины вы хотите?");
        scanner.nextLine();
        String Type = scanner.nextLine();
        MediumToyCars mediumToyCars = new MediumToyCars(150,150,"China",quantity,Type);
        return mediumToyCars;
    }

    public static BigToyCars getBigToyCars (){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Сколько маленьких машинок вы хотите?");
        int quantity = scanner.nextInt();
        System.out.println("Какую модель машины вы хотите?");
        scanner.nextLine();
        String Type = scanner.nextLine();
        BigToyCars bigToyCars = new BigToyCars(140,250,"China",quantity,Type);
        return bigToyCars;
    }
    public static Cubes getCubes (){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Сколько кубиков вы хотите?");
        int quantity = scanner.nextInt();
        System.out.println("Какую модель кубика вы хотите?");
        scanner.nextLine();
        String Type = scanner.nextLine();
        Cubes cubes = new Cubes(150,90,"Ireland",quantity,Type);
        return cubes;
    }

    public static Dolls getDolls (){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Сколько кукол вы хотите?");
        int quantity = scanner.nextInt();
        System.out.println("Какую модель кукол вы хотите");
        scanner.nextLine();
        String Type = scanner.nextLine();
        Dolls dolls = new Dolls(150,70,"Ireland",quantity,"medium");
        return dolls;
    }

    public static void BallsWriter(Balls balls) throws IOException {
        File file = new File("/home/iskender/Tariel/task14/src/text/tar.txt");
        FileWriter fileWriter = new FileWriter(file,true);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        bufferedWriter.write(""+balls.getPrice()+" "+balls.getWeight()+" "+balls.getMaker() +" "+ balls.getQuantity()+" "+balls.getSportType()+" "+balls.getSize()+" "+balls.getName()+"\n");
        bufferedWriter.close();
    }
    public static void CubesWriter(Cubes cubes) throws IOException {
        File file = new File("/home/iskender/Tariel/task14/src/text/tar.txt");
        FileWriter fileWriter = new FileWriter(file,true);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        bufferedWriter.write(cubes.getPrice()+" "+cubes.getWeight()+" "+cubes.getMaker() +" "+ cubes.getQuantity()+" "+cubes.getTypeOfCube()+" "+cubes.getName()+"\n");
        bufferedWriter.close();
    }
    public static void DollsWriter(Dolls dolls) throws IOException {
        File file = new File("/home/iskender/Tariel/task14/src/text/tar.txt");
        FileWriter fileWriter = new FileWriter(file,true);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        bufferedWriter.write(dolls.getPrice()+" "+dolls.getWeight()+" "+dolls.getMaker() +" "+ dolls.getQuantity()+" "+dolls.getSize()+" "+dolls.getName()+"\n");
        bufferedWriter.close();
    }
    public static void SmallToyCarsWriter(SmallToyCars smallToyCars) throws IOException {
        File file = new File("/home/iskender/Tariel/task14/src/text/tar.txt");
        FileWriter fileWriter = new FileWriter(file,true);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        bufferedWriter.write(smallToyCars.getPrice()+" "+smallToyCars.getWeight()+" "+smallToyCars.getMaker() +" "+ smallToyCars.getQuantity()+" "+smallToyCars.getModel()+" "+smallToyCars.getName()+"\n");
        bufferedWriter.close();
    }
    public static void MediumToyCarsWriter(MediumToyCars mediumToyCars) throws IOException {
        File file = new File("/home/iskender/Tariel/task14/src/text/tar.txt");
        FileWriter fileWriter = new FileWriter(file,true);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
         bufferedWriter.write(mediumToyCars.getPrice()+" "+mediumToyCars.getWeight()+" "+mediumToyCars.getMaker() +" "+ mediumToyCars.getQuantity()+" "+mediumToyCars.getModel()+" "+mediumToyCars.getName()+"\n");
        bufferedWriter.close();
    }

    public static void BigToyCarsWriter(BigToyCars bigToyCars) throws IOException {
        File file = new File("/home/iskender/Tariel/task14/src/text/tar.txt");
        FileWriter fileWriter = new FileWriter(file,true);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        bufferedWriter.write(bigToyCars.getPrice()+" "+bigToyCars.getWeight()+" "+bigToyCars.getMaker() +" "+ bigToyCars.getQuantity()+" "+bigToyCars.getModel()+" "+bigToyCars.getName()+"\n");
        bufferedWriter.close();
    }
    static void printerTwoDimensional(String[][] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("\n");


    }


    public static void fileReader(File file) throws FileNotFoundException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
        try {
            Scanner scanner = new Scanner(System.in);
            String nextLine;
            List<List> array = new ArrayList<>();
            while ((nextLine = bufferedReader.readLine()) != null) {
                StringBuilder stringBuilder = new StringBuilder(nextLine);
                for (int i = 0; i < stringBuilder.length(); i++) {
                    if (stringBuilder.charAt(i) == '"') stringBuilder.deleteCharAt(i);
                }
                array.add(List.of(stringBuilder.toString().split(" ")));

           }
            System.out.println(array);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}