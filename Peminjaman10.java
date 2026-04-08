public class Peminjaman10 {
    Mahasiswa10 mahasiswa;
    Buku10 buku;
    int lamaPinjam;
    int batasPinjam = 5;
    int terlambat;
    int denda;

    Peminjaman10(Mahasiswa10 mhs, Buku10 buku, int lamaPinjam) {
        this.mahasiswa = mhs;
        this.buku = buku;
        this.lamaPinjam = lamaPinjam;
        hitungDenda();
    }

    void hitungDenda() {
        if (lamaPinjam > batasPinjam) {
            terlambat = lamaPinjam - batasPinjam;
            denda = terlambat * denda;
        } else {
            terlambat = 0;
            denda = 0;
        }
    }

    void tampilPeminjaman() {
        System.out.println("NIM           : " + mahasiswa.nim);
        System.out.println("Nama          : " + mahasiswa.nama);
        System.out.println("Judul Buku    : " + buku.judul);
        System.out.println("Lama Pinjam   : " + lamaPinjam + " hari");
        System.out.println("Keterlambatan : " + terlambat + " hari");
        System.out.println("Denda         : Rp " + denda);
    }
}
