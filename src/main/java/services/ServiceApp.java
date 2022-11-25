package services;

import repository.IRepoMahasiswa;
import repository.RepoMahasiswa;

import java.util.Scanner;

public class ServiceApp implements IServiceApp{
    private IRepoMahasiswa repoMahasiswa;
    
    public ServiceApp(IRepoMahasiswa repoMahasiswa) {
        this.repoMahasiswa = repoMahasiswa;
    }
    
    Scanner input = new Scanner (System.in);

    protected String addNama;
    protected String addUmur;
    protected String addJurusan;

    public void addMahasiswa(){
        while (true){
            System.out.print ("Nama : ");
            String nama = input.nextLine ();
            if (nama.length ()>20){
                System.out.println ("Tidak boleh lebih dari 20 karakter");
            } else if (nama.length ()<3) {
                System.out.println ("Tidak boleh kurang dari 3 karakter");
            } else {
                this.addNama = nama;
                break;
            }
        }
        while (true){
            System.out.print ("Umur : ");
            String umur = input.nextLine ();
            if (Integer.parseInt (umur)<17){
                System.out.println ("Masih di bawah umur!");
            }else {
                this.addUmur = umur;
                break;
            }
        }
        while (true){
            System.out.print ("Jurusan : ");
            String jurusan = input.nextLine ();
            if (jurusan.length ()>10){
                System.out.println ("Tidak boleh lebih dari 10 karakter");
            }else {
                this.addJurusan = jurusan;
                break;
            }
        }
//        if (){
//
//        }
        repoMahasiswa.create (this.addNama, this.addUmur, this.addJurusan);
        System.out.println ("Data telah disimpan.\n");
    }
    public void viewMahasiswa(){
        allMahasiswa ();
        oneMahasiswa ();
    }
    public void allMahasiswa(){
        String allMahasiswa = repoMahasiswa.viewAll ();
        System.out.println ("--------\n"+"Data Mahasiswa : \n"+"--------");
        System.out.println (allMahasiswa);
    }
    public void oneMahasiswa (){
        System.out.println ("Masukkan index data yang diinginkan : ");
        String id = input.nextLine ();
        System.out.println ("-----------\n"+"Data Mahasiswa index ke- "+id+": \n"+"-----------");
        String oneMahasiswa = repoMahasiswa.viewOne (id);
        System.out.println (oneMahasiswa);
    }
    public void delMahasiswa(){
        repoMahasiswa.delete ();
    }
}
