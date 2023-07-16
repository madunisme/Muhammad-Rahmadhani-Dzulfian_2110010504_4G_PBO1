
package pbo;

// class
public class Perpustakaan {
    // atribut dan enkapsulasi
    private String kd_buku;
    private String nm_buku;
    
    
    // Konstruktor
    public Perpustakaan(String kd_buku, String nm_buku) {
        this.kd_buku = kd_buku;
        this.nm_buku = nm_buku;
    }
    
    // Mutator
    public void setKd_buku(String kd_buku) {
        this.kd_buku = kd_buku;
    }

    public void setNm_buku(String nm_buku) {
        this.nm_buku = nm_buku;
    }
    
    
    // Aksesor
    public String getKd_buku() {
        return kd_buku;
    }

    public String getNm_buku() {
        return nm_buku;
    }
    
    
    //Polymorph
    /*
    public void tampilInfo(){
       System.out.println("Kode Buku          : "+getKd_buku());
       System.out.println("Judul Buku         : "+getNm_buku());
    }
    
    */
    
    public void tampilInfo(){
        System.out.println(" =========================================");
        System.out.println("   SISTEM INFORMASI PERPUSTAKAAN SEKOLAH");
        System.out.println(" =========================================");
        System.out.println(" Kode Buku : "+getKd_buku());
        System.out.println(" Judul Buku : "+getNm_buku());
        System.out.println(" =========================================");
    }
    
}
