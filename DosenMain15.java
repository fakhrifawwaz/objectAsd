public class DosenMain15 {
    public static void main(String[] args) {

        Dosen15 dosen1 = new Dosen15();
        dosen1.idDosen = "DSN-001";
        dosen1.nama = "Pramono Yoga";
        dosen1.statusAktif = true;
        dosen1.tahunBergabung = 2010;
        dosen1.bidangKeahlian = "Algoritma Pemrograman";

        System.out.println("===== Informasi Dosen 1 =====");
        dosen1.tampilInformasi();
        dosen1.setStatusAktif(false);
        dosen1.hitungMasaKerja(2025);
        dosen1.ubahKeahlian("Algoritma dan Struktur Data");
        System.out.println();

        Dosen15 dosen2 = new Dosen15("DSN-002", "Yuli Ananta", true, 2015, "Data Analyst");

        System.out.println("===== Informasi Dosen 2 =====");
        dosen2.tampilInformasi();
        dosen2.setStatusAktif(true);
        dosen2.hitungMasaKerja(2025);
        dosen2.ubahKeahlian("Machine Learning");
    }
}
