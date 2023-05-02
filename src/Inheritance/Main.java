package Inheritance;

public class Main {
    public static void main(String[] args) {
        Manajer m1 = new Manajer("Budi","Manajer");
        Staff s1 = new Staff("Dina","Staff");
        Direktur d1 = new Direktur("Bambang","Direktur");

        m1.tampilkan();
        s1.tampilkan();
        d1.tampilkan();
    }
}
