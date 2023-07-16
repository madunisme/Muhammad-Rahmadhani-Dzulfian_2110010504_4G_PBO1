
package pbo;

// Inheritance
public class Pengembalian extends Perpustakaan {
    
    // Atribut dan Enkapsulasi
        private String nm_pengembalian;
        private String tgl_pengembalian;
        private String kls_pengembalian;
        
    // Konstruktor
    public Pengembalian(String kd_buku, String nm_buku,String nm_pengembalian, String kls_pengembalian,String tgl_pengembalian) {
        super(kd_buku, nm_buku);
        this.nm_pengembalian = nm_pengembalian;
        this.tgl_pengembalian = tgl_pengembalian;
        this.kls_pengembalian = kls_pengembalian;
    }
    
    // Mutator
    public void setNm_pengembalian(String nm_pengembalian) {
        this.nm_pengembalian = nm_pengembalian;
    }

    public void setTgl_pengembalian(String tgl_pengembalian) {
        this.tgl_pengembalian = tgl_pengembalian;
    }

    public void setKls_pengembalian(String kls_pengembalian) {
        this.kls_pengembalian = kls_pengembalian;
    }
    
    
    
    // Aksesor
    public String getNm_pengembalian() {
        return nm_pengembalian;
    }

    public String getTgl_pengembalian() {
        return tgl_pengembalian;
    }

    public String getKls_pengembalian() {
        return kls_pengembalian;
    }
    
    
       
    // Polymorph
        @Override
        public void tampilInfo(){
        System.out.println(" =========================================");
        System.out.println("      PENGEMBALIAN BUKU PERPUSTAKAAN");
        System.out.println(" =========================================");
        System.out.println(" | Kode Buku            : "+getKd_buku());
        System.out.println(" | Judul Buku           : "+getNm_buku());
        System.out.println(" | Nama                 : "+getNm_pengembalian());
        System.out.println(" | Kelas                : "+getKls_pengembalian());
        System.out.println(" | Tanggal Pengembalian : "+getTgl_pengembalian());
        System.out.println("");
    }
        
    
}
