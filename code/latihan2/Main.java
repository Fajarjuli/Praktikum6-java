package latihan2;

import java.util.HashMap;
import java.util.Map;
import java.text.DecimalFormat; // Tambahkan import ini

class Produk {
    String namaProduk;
    double harga;
    int jumlahStok;

    public Produk(String namaProduk, double harga, int jumlahStok) {
        this.namaProduk = namaProduk;
        this.harga = harga;
        this.jumlahStok = jumlahStok;
    }

    public void displayInfo() {
        System.out.println();
        System.out.println("Nama Produk: " + namaProduk);
        System.out.println("Harga: " + harga);
        System.out.println("Jumlah Stok: " + jumlahStok);
    }

    public String getNamaProduk() {
        return namaProduk;
    }

    public double getHarga() {
        return harga;
    }
}

class Elektronik extends Produk {
    int garansi;

    public Elektronik(String namaProduk, double harga, int jumlahStok, int garansi) {
        super(namaProduk, harga, jumlahStok);
        this.garansi = garansi;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Garansi: " + garansi + " tahun");
    }
}

class Pakaian extends Produk {
    String ukuran;
    String warna;

    public Pakaian(String namaProduk, double harga, int jumlahStok, String ukuran, String warna) {
        super(namaProduk, harga, jumlahStok);
        this.ukuran = ukuran;
        this.warna = warna;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Ukuran: " + ukuran);
        System.out.println("Warna: " + warna);
    }
}

class Makanan extends Produk {
    String tanggalKadaluarsa;

    public Makanan(String namaProduk, double harga, int jumlahStok, String tanggalKadaluarsa) {
        super(namaProduk, harga, jumlahStok);
        this.tanggalKadaluarsa = tanggalKadaluarsa;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Tanggal Kadaluarsa: " + tanggalKadaluarsa);
    }
}

class KeranjangBelanja {
    Map<Produk, Integer> produk = new HashMap<>(); // Menggunakan HashMap untuk menyimpan produk dengan jumlahnya

    public void tambahProduk(Produk produk, int jumlah) {
        this.produk.put(produk, this.produk.getOrDefault(produk, 0) + jumlah);
    }

    public void displayInfo() {
        double totalHarga = 0;

        StringBuilder isiKeranjang = new StringBuilder(); // Membuat StringBuilder untuk menyimpan informasi produk
        for (Map.Entry<Produk, Integer> entry : produk.entrySet()) {
            Produk p = entry.getKey();
            int jumlah = entry.getValue();
            p.displayInfo();
            totalHarga += p.getHarga() * jumlah; // Hitung total harga berdasarkan jumlah

            // Tambahkan produk dan jumlah ke StringBuilder
            if (isiKeranjang.length() > 0) {
                isiKeranjang.append(", "); // Tambahkan tanda koma jika sudah ada produk sebelumnya
            }
            isiKeranjang.append(p.getNamaProduk()).append(" ").append(jumlah); // Format: NamaProduk Jumlah
            System.out.println();
        }

        System.out.println("Isi Keranjang Belanja: " + isiKeranjang.toString());

        // Menggunakan DecimalFormat untuk memformat total harga
        DecimalFormat df = new DecimalFormat("#,###");
        System.out.println("Total Harga: " + df.format(totalHarga));
    }
}

public class Main {
    public static void main(String[] args) {
        KeranjangBelanja keranjangBelanja = new KeranjangBelanja();

        Elektronik elektronik = new Elektronik("AC", 4000000, 8, 2);
        Pakaian pakaian = new Pakaian("Baju", 120000, 15, "L", "Hitam");
        Makanan makanan = new Makanan("Roti", 15000, 20, "2024-12-1");

        // Menambahkan produk dengan jumlah tertentu
        keranjangBelanja.tambahProduk(elektronik, 1);
        keranjangBelanja.tambahProduk(pakaian, 2);
        keranjangBelanja.tambahProduk(makanan, 3);

        keranjangBelanja.displayInfo();
        System.out.println();
    }
}
