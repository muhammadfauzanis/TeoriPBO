package AbstractProgram;

class Motor extends Kendaraan{
    int cc;

    Motor(String merk, String model, int tahunProduksi,int cc) {
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
        return 20000000 - (2023 - tahunProduksi) * 100000 + cc * 5000;
    }
}
