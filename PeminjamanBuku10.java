public class PeminjamanBuku10 {
    Mahasiswa10[] listMhs;
    Buku10[] listBuku;
    Peminjaman10[] listPinjam;

    PeminjamanBuku10(Mahasiswa10[] listMhs, Buku10[] listBuku, Peminjaman10[] listPinjam) {
        this.listMhs = listMhs;
        this.listBuku = listBuku;
        this.listPinjam = listPinjam;
    }

    void tampilMhs() {
        System.out.println("---DATA MAHASISWA---");
        for (Mahasiswa10 m : listMhs) {
            m.tampilMahasiswa();
            System.out.println("------------------");
        }
    }

    void tampilBuku() {
        System.out.println("---DATA BUKU---");
        for (Buku10 b : listBuku) {
            b.tampilBuku();
        }
    }

    void tampilPeminjaman() {
        System.out.println("---DATA PEMINJAMAN---");
        for (Peminjaman10 p : listPinjam) {
            p.tampilPeminjaman();
        }
    }

    void sortingDenda() {
        for (int i = 1; i < listPinjam.length; i++) {
            Peminjaman10 temp = listPinjam[i];
            int j = i - 1;

            while (j >= 0 && listPinjam[j].denda < temp.denda) {
                listPinjam[j + 1] = listPinjam[j];
                j--;
            }
            listPinjam[j + 1] = temp;
        }
        System.out.println("Data diurutkan berdasarkan denda dari tertinggi ke terendah: ");
        tampilPeminjaman();
    }

    void sortingNIM() {
        for (int i = 1; i < listPinjam.length; i++) {
            Peminjaman10 temp = listPinjam[i];
            int j = i - 1;

            while (j >= 0 && listPinjam[j].mahasiswa.nim.compareTo(temp.mahasiswa.nim) > 0) {
                listPinjam[j + 1] = listPinjam[j];
                j--;
            }
            listPinjam[j + 1] = temp;
        }
    }

    void binarySearch(String nim) {
        sortingNIM();

        int left = 0;
        int right = listPinjam.length - 1;
        boolean ditemukan = false;
        System.out.println("--------------------");
        System.out.println("Hasil pencarian NIM: " + nim);

        while (left <= right) {
            int mid = (left + right) / 2;

            if (listPinjam[mid].mahasiswa.nim.equals(nim)) {
                System.out.println("Data ditemukan pada indeks ke-" + mid);
                listPinjam[mid].tampilPeminjaman();
                ditemukan = true;
                break;
            } else if (listPinjam[mid].mahasiswa.nim.compareTo(nim) < 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }

            if (!ditemukan) {
                System.out.println("Data dengan NIM " + nim + " tidak ditemukan");
            }
        }
    }
}
