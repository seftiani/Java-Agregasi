package javaagregasi;
/**
 *
 * @author Seftiani Ayu Lestari
 */
public class Main {
    public static void main(String args[]){
        
        Prodi p = new Prodi("PTI","Pendidikan Teknologi Informasi");
  
        Mahasiswa m1 = new Mahasiswa();
        m1.setNim("20050974054 ");
        m1.setNama("Seftiani Ayu Lestari");
        
        Mahasiswa m2 = new Mahasiswa();
        m2.setNim("20050974074 ");
        m2.setNama("Verdea Maulida Zahra");
        
        p.addMahasiswa(m1);
        p.addMahasiswa(m2);
        
    System.out.println("Kode Prodi"+p.getKode());
    System.out.println("Nama Prodi"+p.getNama());
    System.out.println("List mahasiswa terdaftar:");
    
    Mahasiswa[] daftar = p.getDaftarMhs();
    for(Mahasiswa m:daftar){
        if(m!=null)
            System.out.println(" -"+m.getNim()+""+m.getNama());
    }
}
}

