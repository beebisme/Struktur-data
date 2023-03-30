package Kegiatan1;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void countBebek(ArrayList<String> arrlist) {
        ArrayList<Integer> idxBebek = new ArrayList<>();
        int counter = 0;

        for (String element : arrlist) {
            if (element == "Bebek") {
                idxBebek.add(counter);
            }
            counter++;
        }

        System.out.print("index bebek : ");
        for (int idx : idxBebek) {
            System.out.print(idx + ", ");
        }

    }

    public static void main(String[] args) {
        ArrayList<String> hewan = new ArrayList<>();

        hewan.add("Angsa");
        hewan.add("Bebek");
        hewan.add("Cicak");
        hewan.add("Domba");
        hewan.add("Elang");
        hewan.add("Gajah");
        hewan.add("Badak");
        hewan.add("Bebek");

        System.out.println("Jumlah Bebek : " + Collections.frequency(hewan, "Bebek"));
        countBebek(hewan);

        System.out.println("\n");

        hewan.remove(1);
        System.out.println(hewan);

        System.out.println("\n");

        System.out.println("index ke 0 : " + hewan.get(0));
        System.out.println("index ke 2 : " + hewan.get(2));
        hewan.remove(0);
        System.out.println(hewan);

        System.out.println("\n");

        hewan.set(0, "Ular");
        hewan.add(2, "Itik");
        System.out.println(hewan);

        System.out.println("\n");

        hewan.subList(2, 5).clear();
        System.out.println(hewan);

        System.out.println("\n");

        System.out.println("Elemen Pertama : " + hewan.get(0));
        System.out.println("Elemen Terakhir : " + hewan.get(hewan.size() - 1));

        System.out.println("\n");

        System.out.println("Jumlah Hewan: " + hewan.size());

        System.out.println("\n");

        System.out.println("Index Badak: " + hewan.indexOf("Badak"));

    }

}
