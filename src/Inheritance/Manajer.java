package Inheritance;

class Manajer extends Karyawan{
    Manajer(String nama, String jabatan) {
        super(nama, jabatan);
    }

    public int gajiManajer() {
        return gaji = 7000000;
    }

    @Override
    void tampilkan() {
        super.tampilkan();
        System.out.println("Gaji: " + gajiManajer());
    }
        
}
