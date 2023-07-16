
package pbo;

// Inheritance
public class Peminjaman extends Perpustakaan {
    
    // Atribut dan Enkapsulasi
    private String nm_peminjaman;
    private String tgl_peminjaman;
    private String kls_peminjaman;
    
    // Konstruktor
    public Peminjaman(String kd_buku, String nm_buku, String nm_peminjaman,String kls_peminjaman, String tgl_peminjaman) {
        super(kd_buku, nm_buku);
        this.nm_peminjaman = nm_peminjaman;
        this.tgl_peminjaman = tgl_peminjaman;
        this.kls_peminjaman = kls_peminjaman;
    }
    
    // Mutator
    public void setNm_peminjaman(String nm_peminjaman) {
        this.nm_peminjaman = nm_peminjaman;
    }

    public void setTgl_peminjaman(String tgl_peminjaman) {
        this.tgl_peminjaman = tgl_peminjaman;
    }

    public void setKls_peminjaman(String kls_peminjaman) {
        this.kls_peminjaman = kls_peminjaman;
    }
    
    

    
    // Aksesor
    public String getNm_peminjaman() {
        return nm_peminjaman;
    }

    public String getTgl_peminjaman() {
        return tgl_peminjaman;
    }

    public String getKls_peminjaman() {
        return kls_peminjaman;
    }
    


    // Polymorph  
    @Override
    public void tampilInfo(){
        System.out.println(" =========================================");
        System.out.println("        PEMINJAMAN BUKU PERPUSTAKAAN");
        System.out.println(" =========================================");
        System.out.println(" | Kode Buku          : "+getKd_buku());
        System.out.println(" | Judul Buku         : "+getNm_buku());
        System.out.println(" | Nama               : "+getNm_peminjaman());
        System.out.println(" | Kelas              : "+getKls_peminjaman());
        System.out.println(" | Tanggal Peminjaman : "+getTgl_peminjaman());
        System.out.println("");
    }
    
    
    
        
        
}
