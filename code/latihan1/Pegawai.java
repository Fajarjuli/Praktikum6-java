package latihan1;

class Pegawai {
    private String nama;
    private double gajiPokok;

    // Constructor tanpa parameter
    public Pegawai() {
        this.nama = "";
        this.gajiPokok = 0;
    }

    // Constructor dengan parameter nama
    public Pegawai(String nama) {
        this.nama = nama;
        this.gajiPokok = 0;
    }

    // Constructor dengan parameter nama dan gajiPokok
    public Pegawai(String nama, double gajiPokok) {
        this.nama = nama;
        this.gajiPokok = gajiPokok;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public void setGajiPokok(double gajiPokok) {
        this.gajiPokok = gajiPokok;
    }

    public double getGajiPokok() {
        return gajiPokok;
    }

    public void cetakInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("Gaji Pokok: " + gajiPokok);
    }
}

class Manager extends Pegawai {
    private double tunjangan;

    // Constructor tanpa parameter
    public Manager() {
        super();
        this.tunjangan = 0;
    }

    // Constructor dengan parameter nama
    public Manager(String nama) {
        super(nama);
        this.tunjangan = 0;
    }

    // Constructor dengan parameter nama dan gajiPokok
    public Manager(String nama, double gajiPokok) {
        super(nama, gajiPokok);
        this.tunjangan = 0;
    }

    // Constructor dengan parameter nama, gajiPokok dan tunjangan
    public Manager(String nama, double gajiPokok, double tunjangan) {
        super(nama, gajiPokok);
        this.tunjangan = tunjangan;
    }

    public void setTunjangan(double tunjangan) {
        this.tunjangan = tunjangan;
    }

    public double getTunjangan() {
        return tunjangan;
    }

    public void cetakInfo() {
        super.cetakInfo();
        System.out.println("Tunjangan: " + tunjangan);
    }
}

class Programmer extends Pegawai {
    private double bonus;

    // Constructor Default
    public Programmer() {
    }

    // Constructor with nama, gajiPokok and bonus
    public Programmer(String nama, double gajiPokok, double bonus) {
        super(nama, gajiPokok);
        this.bonus = bonus;
    }

    // Method
    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public double getBonus() {
        return this.bonus;
    }

    public void cetakInfo() {
        super.cetakInfo();
        System.out.println("Bonus : " + bonus);
    }

    public void cetakBonus() {
        System.out.println("Bonus : " + bonus);
    }
}


