public class Buku10 {
    String kodeBuku;
    String judul;
    int tahunTerbit;

    Buku10(String kode, String judul, int tahun) {
        kodeBuku = kode;
        this.judul = judul;
        this.tahunTerbit = tahun;
    }

    void tampilBuku() {
        System.out.println("Kode Buku   : "+kodeBuku);
        System.out.println("Judul       : "+judul);
        System.out.println("Tahun Terbit: "+tahunTerbit);
    }
}
