
package pbo;

import java.util.Scanner;
        
public class PerpustakaanBeraksi {
    
    public static void main(String[] args) {
        // Error Handling
        try{
            

            String lagi ="Y";
            Scanner input = new Scanner(System.in);
            
            // Perulangan
            while(lagi.equalsIgnoreCase("Y")){


            System.out.println(" =========================================");
            System.out.println("    PERPUSTAKAAN SEKOLAH SMA BINA MARGA");
            System.out.println(" =========================================");
            System.out.println(" |         1. PEMINJAMAN BUKU            |");
            System.out.println(" |         2. PENGEMBALIAN BUKU          |");
            System.out.println(" |         3. DAFTAR BUKU                |");
            System.out.println(" =========================================");
            // IO Sederhana
            System.out.print(" Pilih Kategori: ");
            int kategori = input.nextInt();
            input.nextLine();
            System.out.println("");

                switch(kategori){
                    
                    // Seleksi
                    case 1:{
                        // array
                        Peminjaman[] pinjam = new Peminjaman[2];

                        // Perulangan
                        for(int i=0; i<pinjam.length; i++){

                            System.out.println(" ==============================================");    
                            System.out.println("        Data Peminjaman Buku Ke-"+(i+1));
                            System.out.println(" ==============================================");  

                            System.out.print(" Masukkan Kode Buku               : ");
                            String kb_peminjaman = input.nextLine();

                            System.out.print(" Masukkan Judul Buku              : ");
                            String nb_peminjaman = input.nextLine();

                            System.out.print(" Masukkan Nama Peminjam           : ");
                            String nm_peminjaman = input.nextLine();

                            System.out.print(" Masukkan Kelas                   : ");
                            String kelas_peminjaman = input.nextLine();

                            System.out.print(" Masukkan Tanggal Peminjaman Buku : ");
                            String tgl_peminjaman = input.nextLine();

                            System.out.println("");

                            // Objek
                            pinjam[i] = new Peminjaman(kb_peminjaman, nb_peminjaman, nm_peminjaman, 
                                    kelas_peminjaman, tgl_peminjaman);
                         }

                        // Perulangan Array
                        for (Peminjaman data: pinjam){
                               data.tampilInfo();
                        }

                        break;
                    }


                    case 2: {
                        // array
                        Pengembalian[] kembali = new Pengembalian[2];

                        // Perulangan
                        for(int i=0; i<kembali.length; i++){

                            System.out.println(" ======================================================");    
                            System.out.println("             Data Pengembalian Buku Ke-"+(i+1));
                            System.out.println(" ======================================================");  

                            System.out.print(" Masukkan Kode Buku               : ");
                            String kb_pengembalian = input.nextLine();

                            System.out.print(" Masukkan Judul Buku              : ");
                            String nb_pengembalian = input.nextLine();

                            System.out.print(" Masukkan Nama Peminjam           : ");
                            String nm_pengembalian = input.nextLine();

                            System.out.print(" Masukkan Kelas                   : ");
                            String kelas_pengembalian = input.nextLine();

                            System.out.print(" Masukkan Tanggal Peminjaman Buku : ");
                            String tgl_pengembalian = input.nextLine();

                            System.out.println("");

                            // Objek
                            kembali[i] = new Pengembalian(kb_pengembalian, nb_pengembalian, 
                                    nm_pengembalian, kelas_pengembalian, tgl_pengembalian);
                         }

                        // Perulangan Array
                        for (Pengembalian data: kembali){
                               data.tampilInfo();
                        }

       
                       break;  
                    }
                
                case 3: {
                    
                    System.out.println(" =========================================");
                    System.out.println("                 DAFTAR BUKU");
                    System.out.println(" =========================================");
                    System.out.println(" |         1. BUKU PAKET                 |");
                    System.out.println(" |         2. KAMUS BAHASA               |");
                    System.out.println(" =========================================");
                    System.out.print(" Pilih Kategori: ");
                    int kategoriBuku = input.nextInt();
                    
                    // Seleksi Menu
                        switch (kategoriBuku){
                            case 1: {
                                
                                System.out.println(" =========================================");
                                System.out.println("                 BUKU PAKET");
                                System.out.println(" =========================================");
                                System.out.println(" |         1. BUKU PAKET B. INGGRIS       |");
                                System.out.println(" |         2. BUKU PAKET B. INDONESIA     |");
                                System.out.println(" |         3. BUKU PAKET MATEMATIKA       |");
                                System.out.println(" =========================================");
                                System.out.print(" Pilih Buku : ");
                                int pilihBukuPaket = input.nextInt();
                                input.nextLine();
                                System.out.println("");
                                
                                    // Seleksi Menu Buku Paket
                                    if(pilihBukuPaket == 1){
                                        DaftarBuku bpBing = new DaftarBuku("BP001","Buku Paket B.Inggris",
                                                "Gramedia", 2015);
                                        
                                        bpBing.tampilInfo();
                                        
                                    } else if (pilihBukuPaket == 2){
                                        DaftarBuku bpBind = new DaftarBuku("BP002","Buku Paket B.Indonesia",
                                                "Gramedia", 2017);
                                        
                                        bpBind.tampilInfo();
                                    } else if (pilihBukuPaket == 3){
                                        DaftarBuku bpMtk = new DaftarBuku("BP003","Buku Paket Matematika",
                                                "Gramedia", 2019);
                                        
                                         bpMtk.tampilInfo();
                                    } else {
                                        System.out.println("Tidak ada di daftar");
                                    }
                                
                                break;
                            }
                            
                            case 2: {
                                
                                System.out.println(" =========================================");
                                System.out.println("                 KAMUS BAHASA");
                                System.out.println(" =========================================");
                                System.out.println(" |         1. KAMUS B. INGGRIS       |");
                                System.out.println(" |         2. KAMUS B. INDONESIA     |");
                                System.out.println(" =========================================");
                                System.out.print(" Pilih Kamus : ");
                                int pilihKamus = input.nextInt();
                                input.nextLine();
                                System.out.println("");
                                
                                 // Seleksi Menu Kamus
                                    if(pilihKamus == 1){
                                        DaftarBuku ksBing = new DaftarBuku("KS001","Kamus B.Inggris",
                                                "Gramedia", 2014);
                                        
                                        ksBing.tampilInfo();
                                        
                                    } else if (pilihKamus == 2){
                                        DaftarBuku ksBind = new DaftarBuku("KS002","Kamus B.Indonesia",
                                                "Gramedia", 2013);
                                        
                                        ksBind.tampilInfo();
                                    } else {
                                        System.out.println("Tidak ada di daftar");
                                    }
                                
                                break;
                            }
                        }
                    
                    break;
                    }
                    
                default:
                System.out.println("Menu tidak ada di pilihan");
                System.out.println("");
                }

                System.out.print("Apakah anda ingin kembali ke Menu Awal [Y/T] ? :");
                lagi = input.nextLine();
             }
        } catch(Exception e){
            System.out.println("Kesalahan Input Menu "+e.getMessage());
        }
    }
    
}
