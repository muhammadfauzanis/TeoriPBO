package AbstractProgram;

class Mobil extends Kendaraan {
    int cc;

    Mobil(String merk, String model, int tahunProduksi,int cc) {
        super(merk, model, tahunProduksi);
        this.cc = cc;
    }
    
    @Override
    void info() {
        super.info();
        System.out.println("CC mesin: " + cc);
    }

    @Override
    int hargaJual() {
        return 200000000 - (2023 - tahunProduksi) * 1000000 + cc * 50000;
    }
}
