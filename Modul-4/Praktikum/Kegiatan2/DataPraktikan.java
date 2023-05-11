package Kegiatan2;

import java.util.HashMap;
import java.util.Scanner;

public class DataPraktikan {
    public static boolean login;
    public static Scanner sc = new Scanner(System.in);

    private HashMap<String, String> data;
    private HashMap<String, String> tabSesiLogin;

    public DataPraktikan() {
        this.data = new HashMap<>();
        this.tabSesiLogin = new HashMap<>();
    }

    public boolean tambahData(String nimPraktikan, String namaAsisten) {
        if (nimPraktikan.matches("IF(.*)") && nimPraktikan.matches("(.*)[0-9]+") && !data.containsKey(nimPraktikan)) {
            data.put(nimPraktikan, namaAsisten);
            return true;
        }
        return false;
    }

    public void tampil() {
        System.out.println("Data yang tersimpan : ");
        data.forEach((nimPraktikan, namaAsisten) -> {
            System.out.println("Nim Praktikan : " + nimPraktikan + " Nama Asisten : " + namaAsisten);
        });
    }

    public void listNimPraktikan() {
        System.out.println("NIM Praktikan : ");
        for (String nimPraktikan : data.keySet()) {
            System.out.println(nimPraktikan);
        }
    }

    public void listNamaAsisten() {
        System.out.println("Nama Asisten : ");
        for (String namaAsisten : data.values()) {
            System.out.println(namaAsisten);
        }
    }

    public int totalEmail() {
        return data.size();
    }

    public boolean hapusData(String nimPraktikan, String namaAsisten) {
        if (data.containsKey(nimPraktikan) && data.get(nimPraktikan).equals(namaAsisten)) {
            data.remove(nimPraktikan);
            return true;
        }
        return false;
    }

    public void editData(String nimPraktikan, String namaAsisten) {
        if (data.containsKey(nimPraktikan)) {
            data.put(nimPraktikan, namaAsisten);
        }
    }

    public void login() {
        tabSesiLogin.put("user@webmail.umm.ac.id", "admin");
        String email;
        String pass;

        System.out.println("Silahkan login");
        System.out.print("Email    : ");
        email = sc.nextLine();
        System.out.print("Password : ");
        pass = sc.nextLine();

        loginCheck(email, pass);

        if (login = false) {
            System.out.println("gagal login");
            login();
        }
    }

    boolean loginCheck(String Email, String Password) {
        if (Email.matches("(.*)@umm.ac.id") && tabSesiLogin.containsValue(Password)
                && tabSesiLogin.containsKey(Email)) {
            login = true;
            return true;
        } else {
            login = false;
            return false;
        }
    }

    public void logout() {
        login();
    }

    public static void main(String[] args) {
        DataPraktikan data = new DataPraktikan();

        int pilihan;
        char repeat;

        System.out.println("Selamat datang di aplikasi lab");
        data.login();

        do {
            System.out.println("=== DATA LIST PRAKTIKAN UNTUK PRAKTIKUM ===");
            System.out.println("1. Tambah Data");
            System.out.println("2. Menampilkan Data");
            System.out.println("3. Menampilkan Nim Praktikan");
            System.out.println("4. Menampilkan Nama Asisten");
            System.out.println("5. Total Data");
            System.out.println("6. Hapus Data");
            System.out.println("7. Edit Data");
            System.out.println("8. Logout");
            System.out.println("0. Exit");

            System.out.print("Inputkan pilihan : ");
            pilihan = sc.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan nim praktikan : ");
                    String nimPraktikan = sc.next();
                    while (!nimPraktikan.contains("IF")) {
                        System.out.println("nim praktikan harus mengandung 'IF'");
                        System.out.println("Masukkan nim praktikan : ");
                        nimPraktikan = sc.next();
                    }
                    System.out.print("Masukkan nama asisten : ");
                    String namaAsisten = sc.next();
                    data.tambahData(nimPraktikan, namaAsisten);
                    break;
                case 2:
                    data.tampil();
                    break;
                case 3:
                    data.listNimPraktikan();
                    break;
                case 4:
                    data.listNamaAsisten();
                    break;
                case 5:
                    System.out.println("Jumlah Data Praktikan : " + data.totalEmail());
                    break;
                case 6:
                    System.out.println("Nim praktikan yang ingin dihapus : ");
                    sc.nextLine();
                    String nimPraktikanToDelete = sc.nextLine();
                    System.out.println("Masukkan Nama Asisten : ");
                    String namaAsistenToDelete = sc.nextLine();
                    if (data.hapusData(nimPraktikanToDelete, namaAsistenToDelete)) {
                        System.out.println("Data berhasil dihapus");
                    } else {
                        System.out.println("Data tidak ditemukan");
                    }
                    break;
                case 7:
                    System.out.println("Masukkan NIM praktikan yang ingin diubah : ");
                    String nimToEdit = sc.next();
                    while (!nimToEdit.contains("IF")) {
                        System.out.println("NIM praktikan harus mengandung 'IF'");
                        System.out.println("Masukkan NIM praktikan yang ingin diubah : ");
                        nimToEdit = sc.next();
                    }
                    System.out.println("Masukkan nama asisten baru : ");
                    String newNamaAsisten = sc.next();
                    data.editData(nimToEdit, newNamaAsisten);
                    break;
                case 8:
                    data.logout();
                case 0:
                    System.out.println("Program dihentikan");
                    System.exit(0);

            }
            System.out.println("Apakah ingin melanjutkan program?, (Y/N)");
            repeat = sc.next().charAt(0);

            if (repeat == 'N' || repeat == 'n') {
                System.out.println("Program selesai");
                System.exit(0);
            }
        } while (login = true && repeat == 'Y' || repeat == 'y');

    }
}
