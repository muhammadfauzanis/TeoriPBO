package Inheritance;

class Staff extends Karyawan{
  
    Staff(String nama, String jabatan) {
        super(nama, jabatan);
    }

    public int gajiStaff() {
        return gaji = 3000000;
    }

    @Override
    void tampilkan() {
        super.tampilkan();
        System.out.println("Gaji: " + gajiStaff());
    }
    
}
