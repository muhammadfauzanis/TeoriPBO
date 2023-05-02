package Inheritance;

class Karyawan {
    String nama;
    String jabatan;
    int gaji;
    
    Karyawan(String nama,String jabatan){
        this.nama = nama;
        this.jabatan = jabatan;
    }

    // public void setNama(String nama){
    //     this.nama = nama;
    // }

    // public void setJabatan(String jabatan){
    //     this.jabatan = jabatan;
    // }

    // public String getNama(){
    //     return this.nama;
    // }

    // public String getJabatan(){
    //     return this.jabatan;
    // }

    public int gajiKaryawan(){
       return gaji = 0;        
    }

    void tampilkan(){
        System.out.println("-----------------");
        System.out.println("Nama: " + nama);
        System.out.println("Jabatan: " + jabatan);
    }
}
