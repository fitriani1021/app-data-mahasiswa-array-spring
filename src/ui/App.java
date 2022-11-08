package ui;

import services.ServiceApp;

import java.util.Scanner;

public class App {
    public void run () {
                ServiceApp serviceApp = new ServiceApp ();
                Scanner input = new Scanner (System.in);
                Boolean isRun = true;
                String screen = "-----------\n" + " Main Menu\n" + "-----------\n" + "1. Add Mahasiswa\n"+"2. Delete Mahasiswa\n"+"3. View Mahasiswa\n"+"4. Exit\n" ;
        do {
            try {
                System.out.println (screen);
                System.out.print ("Masukkan Menu yang dipilih : ");
                Integer selectedMenu = input.nextInt ();
//                AddMahasiswa addMahasiswa = new AddMahasiswa ("Fitri",25,"TI");
                if (selectedMenu == 1){
                        serviceApp.addMahasiswa();
                }else if (selectedMenu == 2){
                    serviceApp.delMahasiswa();
                }else if (selectedMenu == 3){
                    System.out.println ("1. Lihat Semua Data");
                    System.out.println ("2. Lihat Berdasarkan Index");
                    System.out.print ("Pilih Menu : ");
                    Integer select = input.nextInt ();
                    switch (select){
                        case 1:
                            serviceApp.allMahasiswa();
                            break;
                        case 2:
                            serviceApp.oneMahasiswa();
                            break;
                        default:
                            System.out.println ("Menu tidak tersedia!\n");
                            break;
                    }
                }else if (selectedMenu == 4){
                    isRun = false;
                }else {
                        System.out.println ("Menu tidak tersedia!\n");
                }
            }catch (Exception e){
                System.out.println ("Input Harus Angka! \n");
            }
        }while (isRun);
    }
}
