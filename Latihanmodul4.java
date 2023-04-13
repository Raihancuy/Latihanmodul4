import java.util.HashMap;
import java.util.Scanner;

public class Latihanmodul4 {
    String nama,kelas, matkulPraktikum;
    int nim;

    public Latihanmodul4(String nm, String kl, String mat, int ni){
        nama = nm;
        kelas = kl;
        matkulPraktikum = mat;
        nim = ni;
    }
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        HashMap<String, Latihanmodul4> mhs = new HashMap<>();
        String input;
        Latihanmodul4 data;

        mhs.put("1", new Latihanmodul4("Putri", "3H", "Struktur Data", 2020000));
        mhs.put("2", new Latihanmodul4("Agus", "3A", "Matematika", 2020012));
        mhs.put("3", new Latihanmodul4("Arro", "3D", "Pemrograman", 2020017));

        System.out.println("Masukkan ID: ");
        input = in.nextLine();
        data = mhs.get(input);
        if (data != null){
            System.out.println("Data Mahasiswa : " + data.nama + ", kelas : " + data.kelas + ", mata kuliah praktikum : " + data.matkulPraktikum + ", nim : " + data.nim);
        }
    }
}