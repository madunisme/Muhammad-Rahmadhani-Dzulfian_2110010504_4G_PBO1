# Proyek Akhir Pemrograman Berbasis Objek 1

Proyek ini adalah contoh sederhana aplikasi perpustakaan sekolah menggunakan Java sebagai tugas akhir dari mata kuliah pemrograman berbasis objek 1.

## Deskripsi

Aplikasi ini menerima input berupa kode buku, nama / judul buku, penulis, tahun terbit buku, nama siswa, kelas, dan tanggal peminjaman / pengembalian buku
dan memberikan output berupa informasi detail dari :
- Peminjaman Buku
  ( seperti kode buku, judul buku, nama peminjam, kelas, dan tanggal peminjaman buku )
- Pengembalian Buku
  ( seperti kode buku, judul buku, nama pengembali buku, kelas, dan tanggal pengembalian buku )
- Daftar Buku
  ( seperti kode buku, judul buku, penulis, tahun terbit )

Aplikasi ini mengimplementasikan beberapa konsep penting dalam pemrograman berorientasi objek (OOP) 
seperti Class, Object, Atribut, Method Constructor, Method Mutator, Method Accessor, Encapsulation, 
Inheritance, Overloading, Overriding, Seleksi, Perulangan, IO Sederhana, Array, dan Error Handling.

## Penjelasan Kode

Berikut adalah bagian kode yang relevan dengan konsep OOP yang dijelaskan:

1. **Class** adalah template atau blueprint dari object. Pada kode ini, `Perpustakaan`, `Peminjaman`, 
`Pengembalian`, `DaftarBuku`, dan `PerpustakaanBeraksi` adalah contoh dari class.

```bash
public class Perpustakaan {
    ...
}

public class Peminjaman extends Perpustakaan {
    ...
}

public class Pengembalian extends Perpustakaan {
    ...
}

public class DaftarBuku extends Perpustakaan {
    ...
}

public class PerpustakaanBeraksi {
    ...
}
```

2. **Object** adalah instance dari class. Pada kode ini, `pinjam[i] = new Peminjaman(kb_peminjaman, nb_peminjaman, nm_peminjaman, 
   kelas_peminjaman, tgl_peminjaman);` adalah contoh pembuatan object.

```bash
pinjam[i] = new Peminjaman(kb_peminjaman, nb_peminjaman, nm_peminjaman, kelas_peminjaman, tgl_peminjaman);
```

3. **Atribut** adalah variabel yang ada dalam class. Pada kode ini, `kd_buku`,`nm_buku`,
`nm_peminjaman`,`tgl_peminjaman`,`kls_peminjaman`, 
`nm_pengembalian`,`tgl_pengembalian`,`kls_pengembalian`,
`penulis`, `tahunTerbit`, dan `lagi` adalah contoh atribut.

```bash
String kd_buku;
String nm_buku;
```

4. **Constructor** adalah method yang pertama kali dijalankan pada saat pembuatan object. Pada kode ini, constructor ada di dalam class 
`Perpustakaan`, `Peminjaman`, `Pengembalian`, dan `DaftarBuku`.

```bash
  public Perpustakaan(String kd_buku, String nm_buku) {
        this.kd_buku = kd_buku;
        this.nm_buku = nm_buku;
    }

   public Peminjaman(String kd_buku, String nm_buku, String nm_peminjaman,String kls_peminjaman, String tgl_peminjaman) {
        super(kd_buku, nm_buku);
        this.nm_peminjaman = nm_peminjaman;
        this.tgl_peminjaman = tgl_peminjaman;
        this.kls_peminjaman = kls_peminjaman;
    }

   public Pengembalian(String kd_buku, String nm_buku,String nm_pengembalian, String kls_pengembalian,String tgl_pengembalian) {
        super(kd_buku, nm_buku);
        this.nm_pengembalian = nm_pengembalian;
        this.tgl_pengembalian = tgl_pengembalian;
        this.kls_pengembalian = kls_pengembalian;
    }

    public DaftarBuku(String kd_buku, String nm_buku, String penulis, int tahunTerbit) {
        super(kd_buku, nm_buku);
        this.penulis = penulis;
        this.tahunTerbit = tahunTerbit;
    }

```

5. **Mutator** atau setter digunakan untuk mengubah nilai dari suatu atribut. Pada kode ini, `setKd_buku`, `setNm_buku`, `setNm_peminjaman`, `setTgl_peminjaman`,
`setKls_peminjaman`,`setNm_pengembalian`, `setTgl_pengembalian`,`setKls_pengembalian`, 
`setPenulis` dan `setTahunTerbit` adalah contoh method mutator.

```bash
  public void setKd_buku(String kd_buku) {
        this.kd_buku = kd_buku;
    }

    public void setNm_buku(String nm_buku) {
        this.nm_buku = nm_buku;
    }
```

6. **Accessor** atau getter digunakan untuk mengambil nilai dari suatu atribut. Pada kode ini, `getKd_buku`, `getNm_buku`, 
`getNm_peminjaman`, `getTgl_peminjaman`,`getKls_peminjaman`,`getNm_pengembalian`, 
`getTgl_pengembalian`,`getKls_pengembalian`, `getPenulis` dan `getTahunTerbit` adalah contoh method accessor.

```bash
  public String getKd_buku() {
        return kd_buku;
    }

    public String getNm_buku() {
        return nm_buku;
    }
```

7. **Encapsulation** adalah konsep menyembunyikan data dengan membuat atribut menjadi 
private dan hanya bisa diakses melalui method. Pada kode ini, atribut `kd_buku`,`nm_buku`,
`nm_peminjaman`,`tgl_peminjaman`,`kls_peminjaman`, 
`nm_pengembalian`,`tgl_pengembalian`,`kls_pengembalian`,
`penulis`, dan `tahunTerbit` dienkapsulasi dan hanya bisa diakses melalui method getter dan setter.

```bash
private String kd_buku;
private String nm_buku;
```

8. **Inheritance** adalah konsep di mana sebuah class bisa mewarisi property dan method dari class lain. 
Pada kode ini, `Peminjaman`, 
`Pengembalian`, `DaftarBuku` mewarisi `Perpustakaan` dengan sintaks `extends`.

```bash
public class Peminjaman extends Perpustakaan {
    ...
}

public class Pengembalian extends Perpustakaan {
    ...
}

public class DaftarBuku extends Perpustakaan {
    ...
}
```

9. **Polymorphism** adalah konsep di mana sebuah nama dapat digunakan untuk merujuk ke beberapa tipe atau bentuk objek berbeda. 
Ini memungkinkan metode-metode dengan nama yang sama untuk berperilaku berbeda tergantung pada tipe objek yang mereka manipulasi, 
polymorphism bisa berbentuk Overloading ataupun Overriding. 
Pada kode ini, method `tampilInfo` di `Peminjaman`,`Pengembalian`,`DaftarBuku`  merupakan override dari method `tampilInfo` di `Perpustakaan`.

```bash

@Override
public void tampilInfo() {
    ...
}
```

10. **Seleksi** adalah statement kontrol yang digunakan untuk membuat keputusan berdasarkan kondisi. 
Pada kode ini, digunakan seleksi `if else` dalam class `PerpustakaanBeraksi` dan seleksi `switch` di dalam class `PerpustakaanBeraksi`.

```bash
  if(pilihKamus == 1){
      DaftarBuku ksBing = new DaftarBuku("KS001","Kamus B.Inggris", "Gramedia", 2014);
      ksBing.tampilInfo();
    } else if (pilihKamus == 2){
      DaftarBuku ksBind = new DaftarBuku("KS002","Kamus B.Indonesia","Gramedia", 2013);
       ksBind.tampilInfo();
    } else {
      System.out.println("Tidak ada di daftar");
     }

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
         DaftarBuku bpBing = new DaftarBuku("BP001","Buku Paket B.Inggris","Gramedia", 2015);
         bpBing.tampilInfo();
            } else if (pilihBukuPaket == 2){
            DaftarBuku bpBind = new DaftarBuku("BP002","Buku Paket B.Indonesia","Gramedia", 2017);
             bpBind.tampilInfo();
            } else if (pilihBukuPaket == 3){
            DaftarBuku bpMtk = new DaftarBuku("BP003","Buku Paket Matematika","Gramedia", 2019);
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
```

11. **Perulangan** adalah statement kontrol yang digunakan untuk menjalankan blok kode berulang kali. 
Pada kode ini, digunakan loop `for` untuk meminta input dan menampilkan data.

```bash
for(int i=0; i<pinjam.length; i++) {
    ...
}
```

12. **Input Output Sederhana** digunakan untuk menerima input dari user dan menampilkan output ke user. 
Pada kode ini, digunakan class `Scanner` untuk menerima input dan method `System.out.println` untuk menampilkan output.

```bash
Scanner input = new Scanner(System.in);


 System.out.print(" Pilih Kategori: ");
 int kategori = input.nextInt();
```

13. **Array** adalah struktur data yang digunakan untuk menyimpan beberapa nilai dalam satu variabel. 
Pada kode ini, ` Peminjaman[] pinjam = new Peminjaman[2];`,` Pengembalian[] kembali = new Pengembalian[2];` adalah contoh penggunaan array.

```bash
 Peminjaman[] pinjam = new Peminjaman[2];

 Pengembalian[] kembali = new Pengembalian[2];
```

14. **Error Handling** digunakan untuk menangani error yang mungkin terjadi saat runtime. Pada kode ini, digunakan `try catch` untuk menangani error.

```bash
try {
    // code that might throw an exception
} catch (Exception e) {
    System.out.println("Kesalahan Input Menu "+e.getMessage());
}
```

## Usulan nilai

| No  | Materi         |  Nilai  |
| :-: | -------------- | :-----: |
|  1  | Class          |    5    |
|  2  | Object         |    5    |
|  3  | Atribut        |    5    |
|  4  | Constructor    |    5    |
|  5  | Mutator        |    5    |
|  6  | Accessor       |    5    |
|  7  | Encapsulation  |    5    |
|  8  | Inheritance    |    5    |
|  9  | Polymorphism   |   10    |
| 10  | Seleksi        |    5    |
| 11  | Perulangan     |    5    |
| 12  | IO Sederhana   |   10    |
| 13  | Array          |   15    |
| 14  | Error Handling |   15    |
|     | **TOTAL**      | **100** |

## Pembuat

Nama: Muhammad Rahmadhani Dzulfian
NPM: 2110010504
