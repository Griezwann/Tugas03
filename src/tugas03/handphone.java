
package tugas03;


public class handphone {
    private String merk;
    private String warna;
    private double harga;
    
    
    
    
    void cetakInfo(){
        System.out.println("Merk \t: "+merk+"\n"+
                "warna \t: "+warna+"\n"+
                "harga \t: "+harga);
    }

    public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public String getWarna() {
        return warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }
    
    
}
