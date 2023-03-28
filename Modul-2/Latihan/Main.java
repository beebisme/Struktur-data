package Latihan;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> Hewan = new ArrayList<>();
        ArrayList<String> DeleteHewan = new ArrayList<>();

        Hewan.add(0, "Sapi");
        Hewan.add(1, "Kelinci");
        Hewan.add(2, "Kambing");
        Hewan.add(3, "Unta");
        Hewan.add(4, "Domba");

        System.out.println("Hewan : " + Hewan + "\n");

        DeleteHewan.add(0, "Kelinci");
        DeleteHewan.add(1, "Kambing");
        DeleteHewan.add(2, "Unta");

        System.out.println("Hewan yang dihapus : " + DeleteHewan + "\n");

        Hewan.remove(DeleteHewan.get(0));
        Hewan.remove(DeleteHewan.get(1));
        Hewan.remove(DeleteHewan.get(2));

        System.out.println(Hewan);

    }
}
