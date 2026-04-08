import java.util.Scanner;
public class Main10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        Mahasiswa10[] listMhs ={
            new Mahasiswa10("22001", "Andi", "Teknik Informatika"),
            new Mahasiswa10("22002", "Budi", "Teknik Informatika"),
            new Mahasiswa10("22003", "Citra", "Sistem Informasi Bisnis")
        };
        Buku10[] listBuku = {
            new Buku10("B001", "Algoritma", 2020),
            new Buku10("B002", "Basis Data", 2019),
            new Buku10("B003", "Pemrograman", 2021),
            new Buku10("B004", "Fisika", 2024)
        };
        Peminjaman10[] listPinjam = {
            new Peminjaman10(listMhs[0], listBuku[0], 7),
            new Peminjaman10(listMhs[1], listBuku[1], 3),
            new Peminjaman10(listMhs[2], listBuku[2], 10),
            new Peminjaman10(listMhs[2], listBuku[3], 6),
            new Peminjaman10(listMhs[0], listBuku[1], 4)
        };
        PeminjamanBuku10 sistem = new PeminjamanBuku10(listMhs, listBuku, listPinjam);

        System.out.println("=== SISTEM PEMINJAMAN RUANG BACA JTI ===");
        System.out.println("1. Tampilkan Data Mahasiswa");
        System.out.println("2. Tampilkan Data Buku");
        System.out.println("3. Tampilkan Peminjaman ");
        System.out.println("4. Urutkan Berdasarkan Denda");
        System.out.println("5. Cari Berdasarkan NIM");
        System.out.println("0. Keluar");
        System.out.print("Pilih: ");
        int menu = sc.nextInt();

        switch (menu) {
            case 1:
                sistem.tampilMhs();
                break;
            case 2:
                sistem.tampilBuku();
                break;
            case 3:
                sistem.tampilPeminjaman();
                break;
            case 4:
                System.out.println("Data diurutkan berdasarkan denda dari tertinggi ke terendah: ");
                sistem.sortingDenda();
                sistem.tampilPeminjaman();
                break;
            case 5:
                System.out.print("Masukkan NIM yang dicari: ");
                String nim = sc.nextLine();
                sistem.binarySearch(nim);
            case 0:
                System.out.println("Anda telah keluar.");
                break;
            default:
                System.out.println("Pilihan tidak valid");
                break;
        }
    }
}