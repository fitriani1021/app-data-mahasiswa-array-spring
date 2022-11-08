package repository;

import model.Mahasiswa;

import java.util.ArrayList;

public class RepoMahasiswa {

    ArrayList<String []> dataMahasiswa = new ArrayList<> ();

    public void create(String nama, String umur, String jurusan){
        int id = dataMahasiswa.size ()+1;
        if(id>5){
            System.out.println ("Hanya boleh terima 5 data!!");
            return;
        }
        String stringId = Integer.toString (id);
        Mahasiswa mahasiswa = new Mahasiswa ();
        mahasiswa.setMahasiswa (stringId,nama,umur,jurusan);

        dataMahasiswa.add (mahasiswa.getMahasiswa ());
    }

    public String viewAll(){
        String result = "";

        for (String[] mahasiswa : dataMahasiswa) {
            result += mahasiswa[0] + ".\n" +
            "Nama = "+mahasiswa[1]+"\n"+
            "Umur = "+mahasiswa[2]+"\n"+
            "Jurusan = "+mahasiswa[3]+"\n";
        }
        return result;
    }

    public String viewOne(String id){
        String result = "";
        for (String[] mahasiswa : dataMahasiswa) {
            if (mahasiswa[0].equals (id)){
                result += mahasiswa[0] + ".\n" +
                        "Nama = "+mahasiswa[1]+"\n"+
                        "Umur = "+mahasiswa[2]+"\n"+
                        "Jurusan = "+mahasiswa[3]+"\n";
            }
        }
        return result;
    }

    public void delete(){
        int index = dataMahasiswa.size ()-1;
        dataMahasiswa.remove (index);
    }
//    public RepoMahasiswa (String inputNama, Integer inputUmur, String inputJurusan) {
//        super (inputNama, inputUmur, inputJurusan);
//    }
//
//    public static void addMahasiswa (){
//        Scanner input = new Scanner (System.in);
//        ArrayList<String> nama = new ArrayList<> ();
//        ArrayList<Integer> umur = new ArrayList<> ();
//        ArrayList<String> jurusan = new ArrayList<> ();
//
//        for (int i = 0; i < 2; i++) {
//            System.out.print ("Masukkan nama = ");
//            nama.add (input.next ());
//            System.out.print ("Masukkan umur = ");
//            umur.add (input.nextInt ());
//            System.out.print ("Masukkan jurusan = ");
//            jurusan.add (input.next ());
//            }
//        System.out.println ("Data Mahasiswa: ");
////        nama.get (nama.size ());
//        System.out.println (nama);
//        System.out.println (umur);
//        System.out.println (jurusan);
//        }

//    @Override
//    public String getNama () {
//        return super.getNama ();
//    }
    
    
}
