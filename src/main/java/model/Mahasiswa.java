package model;

public class Mahasiswa {
    protected static String id;
    protected static String nama;
    protected static String umur;
    protected static String jurusan;

    public String[] getMahasiswa () {
        String[] mahasiswa = {this.id, this.nama, this.umur, this.jurusan};
        return mahasiswa;
    }
    
    public static String getId() {
        return id;
    }
    
    public static void setId(String id) {
        Mahasiswa.id = id;
    }
    
    public static String getNama() {
        return nama;
    }
    
    public static void setNama(String nama) {
        Mahasiswa.nama = nama;
    }
    
    public static String getUmur() {
        return umur;
    }
    
    public static void setUmur(String umur) {
        Mahasiswa.umur = umur;
    }
    
    public static String getJurusan() {
        return jurusan;
    }
    
    public static void setJurusan(String jurusan) {
        Mahasiswa.jurusan = jurusan;
    }
    
    public void setMahasiswa (String id, String nama, String umur, String jurusan) {
        this.id = id;
        this.nama = nama;
        this.umur = umur;
        this.jurusan = jurusan;
    }
    
}
