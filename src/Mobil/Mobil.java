package Mobil;

public class Mobil {
    String Warna;
    int Jumlah_Pintuh;
    float Isi_Tangki;

    public Mobil() {
        super();
    }

    public Mobil(String warna, int jumlah_Pintuh, float isi_Tangki) {
        super();

        Warna = warna;
        Jumlah_Pintuh = jumlah_Pintuh;
        Isi_Tangki = isi_Tangki;
    }

    public int getJumlah_Pintuh() {
        return Jumlah_Pintuh;
    }

    public void setJumlah_Pintuh(int jumlah_Pintuh) {
        Jumlah_Pintuh = jumlah_Pintuh;
    }

    public float getIsi_Tangki() {
        return Isi_Tangki;
    }

    public void setIsi_Tangki(float isi_Tangki) {
        Isi_Tangki = isi_Tangki;
    }

    public String getWarna() {
        return Warna;
    }

    public void setWarna(String warna) {
        Warna = warna;
    }

    public int Majut(int maju) {
        int majuKeDepan = 0;
        majuKeDepan = majuKeDepan + maju;
        return majuKeDepan;
    }

    public int Mundur(int mundur) {
        int mundurKeBelakang = 0;
        mundurKeBelakang = mundurKeBelakang - mundur;
        return mundurKeBelakang;
    }
}
