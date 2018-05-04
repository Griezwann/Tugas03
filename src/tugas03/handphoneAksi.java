package tugas03;
public class handphoneAksi {
    public static void main(String[] args) {
        handphone h = new handphone();
        
        h.setMerk("samsung");
        h.setWarna("putih");
        h.setHarga(5000000);
        
        
        h.cetakInfo();
        
        System.out.print("Merknya \t: ");
        System.out.println(h.getMerk());
        System.out.print("Warnanya \t: ");
        System.out.println(h.getWarna());
        System.out.print("Harganya \t: ");
        System.out.println(h.getHarga());
    
    }
    
}
