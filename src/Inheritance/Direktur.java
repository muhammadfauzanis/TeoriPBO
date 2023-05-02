package Inheritance;

class Direktur extends Karyawan{
 
    Direktur(String nama, String jabatan) {
        super(nama, jabatan);
    }

    public int gajiDirektur() {
        return gaji = 10000000;
    }

    @Override
    void tampilkan() {
        super.tampilkan();
        System.out.println("Gaji: " + gajiDirektur());
    }
    
}
