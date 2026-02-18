public class MataKuliah15 {

    String kodeMK;
    String nama;
    int sks;
    int jumlahJam;


    public MataKuliah15(){

    }

    public MataKuliah15(String kodeMK, String nm, int sks, int jmlJam){

        this.kodeMK = kodeMK;
        nama = nm;
        this.sks = sks;
        jumlahJam = jmlJam;
    }

    void tampilkanInformasi() {
        System.out.println("Kode mata kuliah:" + kodeMK);
        System.out.println("Nama mata kuliah: " + nama);
        System.out.println("Jumlah SKS: " + sks);
        System.out.println("Jumlah jam: " + jumlahJam);
    }

    void ubahSKS (int sksBaru){
        sks = sksBaru;
    }

    void tambahJam (int jam){
        jumlahJam = jumlahJam + jam;
        System.out.println("Jumlah jam bertambah. Total jam sekarang: " + jumlahJam);
    }

    void kurangiJam(int jam) {
        if (jumlahJam < jam) {
            System.out.println("Pengurangan tidak dapat dilakukan. Jumlah jam tidak mencukupi.");
        } else {
            jumlahJam = jumlahJam - jam;
            System.out.println("Jumlah jam berhasil dikurangi. Total jam sekarang: " + jumlahJam);
        }
    }
}

