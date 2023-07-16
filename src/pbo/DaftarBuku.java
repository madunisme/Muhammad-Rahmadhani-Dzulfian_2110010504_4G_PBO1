
package pbo;

    // Inheritance
public class DaftarBuku extends Perpustakaan {
        private String penulis;
        private int tahunTerbit;

    public DaftarBuku(String kd_buku, String nm_buku, String penulis, int tahunTerbit) {
        super(kd_buku, nm_buku);
        this.penulis = penulis;
        this.tahunTerbit = tahunTerbit;
    }
    
    
    // Mutator
    public void setPenulis(String penulis) {
        this.penulis = penulis;
    }

    public void setTahunTerbit(int tahunTerbit) {
        this.tahunTerbit = tahunTerbit;
    }
           
    // Aksesor

    public String getPenulis() {
        return penulis;
    }

    public int getTahunTerbit() {
        return tahunTerbit;
    }
    
    // Polymorph
        public void tampilInfo(){
        System.out.println(" =========================================");
        System.out.println("        INFORMASI TENTANG BUKU INI");
        System.out.println(" =========================================");
        System.out.println(" | Kode Buku            : "+getKd_buku());
        System.out.println(" | Judul Buku           : "+getNm_buku());
        System.out.println(" | Penulis              : "+getPenulis());
        System.out.println(" | Tahun Terbit         : "+getTahunTerbit());
        System.out.println("");
    }
    
}
