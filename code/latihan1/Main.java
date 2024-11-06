package latihan1;

public class Main {
    public static void main(String[] args) {
        System.out.println();
        Pegawai pegawai = new Pegawai("pegawai", 4000000);
        pegawai.cetakInfo();
        System.out.println();

        Manager manager = new Manager("manager", 8000000, 2000000);
        manager.cetakInfo();
        System.out.println();

        Programmer programmer = new Programmer("programmer", 9000000, 1000000);
        programmer.cetakInfo();
        System.out.println();
    }
}