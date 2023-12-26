public class Barang {
    public static String namaBarang;
    public static String idBarang;
    public static int hargaBarang;
    public int jumlahBarang;

    public Barang( String namaBarang, String idBarang, int hargaBarang) {
        this.namaBarang=namaBarang;
        this.idBarang=idBarang;
        this.hargaBarang=hargaBarang;
    }

    public String getNamabarang() {
        return namaBarang;
    }

    public String getIdBarang() {
        return idBarang;
    }

    public int getHargabarang() {
        return hargaBarang;
    }

    public int getJumlahBarang(){
        return jumlahBarang;
    }

    public double getTotalHarga() {
        return hargaBarang * jumlahBarang;
    }
}
