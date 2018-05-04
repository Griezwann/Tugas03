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
        
        smartphone sp = new smartphone();
        sp.setMerk("Iphone X");
        sp.setWarna("black");
        sp.setHarga(20000000);
        sp.setJenisSmartphone("Full Screen");
        sp.cetakInfo();
        System.out.println("Jenis :"+sp.getJenisSmartphone());
        sp.throttle();
                
        
        }
    
}
