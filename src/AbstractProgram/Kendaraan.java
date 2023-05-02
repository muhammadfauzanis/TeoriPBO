package AbstractProgram;

abstract class Kendaraan {
    String merk;
    String model;
    int tahunProduksi;

    Kendaraan(String merk,String model,int tahunProduksi){
        this.merk = merk;
        this.model = model;
        this.tahunProduksi = tahunProduksi;
    }

    void info(){
        System.out.println("Merk: " + merk);
        System.out.println("Model: " + model);
        System.out.println("Tahun Produksi: " + tahunProduksi);
    }

    abstract int hargaJual();
}
