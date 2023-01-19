package javaagregasi;
/**
 *
 * @author Seftiani Ayu Lestari
 */
public class Prodi {
    private String kode,nama;
    private Mahasiswa daftarMhs[] = new Mahasiswa[10];
    private int jumlahMhs;
    
    Prodi(String kode, String nama){
        this.kode = kode;
        this.nama = nama;
    }
    public String getKode(){
        return this.nama;
    }
    public String getNama(){
        return this.nama;
    }
    public int getJumlahMhs(){
        return this.jumlahMhs;
    }
    public void addMahasiswa(Mahasiswa m){
        if(jumlahMhs<this.daftarMhs.length){
            daftarMhs[jumlahMhs] = m;
            jumlahMhs++;
        }
    }
    public Mahasiswa[] getDaftarMhs(){
        return this.daftarMhs;
    }
}
