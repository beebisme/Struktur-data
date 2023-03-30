import java.util.Scanner;

public class Main {
    public static int choice = 0;
    public static String luas, tinggi;
    public static Double a, t;
    public static Scanner input = new Scanner(System.in);

    public static boolean checkNumeric(String str) {
        boolean numeric = true;

        try {
            double num = Double.parseDouble(str);
        } catch (NumberFormatException e) {
            numeric = false;
        }

        return numeric;
    }

    public static void input() {
        System.out.print("masukkan alas : ");
        luas = input.nextLine();

        if (checkNumeric(luas)) {
            a = Double.parseDouble(luas);
            System.out.print("masukkan tinggi : ");
            tinggi = input.nextLine();
            if (checkNumeric(tinggi)) {
                t = Double.parseDouble(tinggi);
            } else {
                System.out.println("hanya boleh menginputkan angka");
                input();
            }
        } else {
            System.out.println("hanya boleh menginputkan angka");
            input();
        }

    }

    public static void choice() {
        input();
        System.out.println();
        System.out.println("1. hasil to int");
        System.out.println("2. hasil to double");
        System.out.print("masukkan pilihan anda : ");
        choice = input.nextInt();
    }

    public static void main(String[] args) {
        choice();
        Segitiga<Integer> luasTipeInt = new Segitiga<>((int) Math.round(a), (int) Math.round(t));
        Segitiga<Double> luasTipeDouble = new Segitiga<>(a, t);

        if (choice == 1) {
            System.out.println(luasTipeInt.getResultAsInt());
        } else if (choice == 2) {
            System.out.println(luasTipeDouble.getResultAsDouble());
        } else {
            System.out.println("anda memasukkan pilihan yang salah");
        }
    }
}
