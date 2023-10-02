package Mobil;

public class TestDrive {
    public static void main(String[] args) throws Exception {
        Mobil mobil = new Mobil("Merah", 4, 100);
        System.out.println("Warna: " + mobil.getWarna());
        System.out.println("Jumlah Pintu: " + mobil.getJumlah_Pintuh());
        System.out.println("Isi Tangki: " + mobil.getIsi_Tangki());

        System.out.println("Maju: " + mobil.Majut(10));
        System.out.println("Mundur: " + mobil.Mundur(5));
    }
}
