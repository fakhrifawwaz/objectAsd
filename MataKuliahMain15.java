public class MataKuliahMain15 {
    public static void main(String[] args) {
        
        MataKuliah15 mk1 = new MataKuliah15();
        mk1.kodeMK = "SIB-01";
        mk1.nama = "Algoritma dan Struktur Data";
        mk1.sks = 3;
        mk1.jumlahJam = 6;

        mk1.tampilkanInformasi();
        mk1.ubahSKS(4);
        mk1.tambahJam(2);
        mk1.kurangiJam(3);
        mk1.kurangiJam(10);
        

        MataKuliah15 mk2 = new MataKuliah15("SIB-02", "Analisis Proses Bisnis", 3,4);

        mk2.tampilkanInformasi();
        mk2.ubahSKS(2);
        mk2.tambahJam(1);
        mk2.kurangiJam(1);
        mk2.kurangiJam(7);
    }
}
