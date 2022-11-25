package repository;

public interface IRepoMahasiswa {
    void create(String nama, String umur, String jurusan);
    String viewAll();
    String viewOne(String id);
    void delete();
}
