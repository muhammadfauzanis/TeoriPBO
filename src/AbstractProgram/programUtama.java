package AbstractProgram;

public class programUtama {
    public static void main(String[] args) {
        Mobil mobil1 = new Mobil("Honda", "Jazz", 2020, 1500);
        Motor motor1 = new Motor("Yamaha", "Aerox", 2020, 155);

        mobil1.info();
        System.out.println("Harga jual: " + mobil1.hargaJual());
        motor1.info();
        System.out.println("Harga jual: " + motor1.hargaJual());
    }
}
