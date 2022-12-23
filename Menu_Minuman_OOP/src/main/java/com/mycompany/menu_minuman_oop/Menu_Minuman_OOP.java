package com.mycompany.menu_minuman_oop;
import java.util.Scanner;
public class Menu_Minuman_OOP {
    private void selamat_datang(){
        
    }
    public static void main(String[] args) {
       Scanner input;
       char ulang;
       double minum;
       Nutrisari_Jeruk Ntrs = new Nutrisari_Jeruk();
       Es_Teh Et = new Es_Teh();
       Kopi_Susu KS = new Kopi_Susu();
       ABC_Mocca AM = new ABC_Mocca();
       Dring_Bengbeng DB = new Dring_Bengbeng();
       Chocolatos CHLTS = new Chocolatos();
       
       do{
           input = new Scanner (System.in);
           Menu_Minuman_OOP MM= new Menu_Minuman_OOP ();
           MM.selamat_datang();
           System.out.println("===#Menu Minuman Rumah Makan Rayond#===");
            System.out.println("========Menu Minuman========");
            System.out.println("-----------------------------");
            System.out.println();
            System.out.println();
            System.out.println("1. Nutrisari Jerus ---- Rp.3.000");
            System.out.println();
            System.out.println("2. Es Teh -------- Rp.3000");
            System.out.println();
            System.out.println("3. Kopi Susu ------ Rp.4000");
            System.out.println();
            System.out.println("4. ABC Mocca ------ Rp.3500");
            System.out.println();
            System.out.println("5. Dring Beng-Beng --- Rp.4000");
            System.out.println();
            System.out.println("6. Chocolatos - Rp.4000");
            System.out.println();
            System.out.println("7. Keluar -- Batalkan pesanan");
            System.out.println();
            System.out.println();
            System.out.println("-----------------------------");
            System.out.println("Pilih [1-7] ----------------:");
            System.out.print("Masukan Pilihan Anda        : ");
            int kode = input.nextInt();
           switch(kode){
                
                case 1 :
                Ntrs.setNama("Nutrisari Jeruk");
                Ntrs.Infodaftarmenu();
                System.out.println("Harga Nutrisari Rp.3,000");
                System.out.print("Jumlah yang akan dipesan ? ");
                Ntrs.setjml1(input.nextInt());
                System.out.println("===============================");
                System.out.println("Total pesanan adalah " +Ntrs.getjml1()+" Gelas, seharga Rp."+Ntrs.getT1());
                System.out.println("Ditambahkan ke dalam tagihan");
                break;
                
                case 2 :
                Et.setNama("Es Teh");
                Et.Infodaftarmenu();
                System.out.println("Harga Es Teh Rp.3,000");
            System.out.print("Jumlah yang akan dipesan ? ");
            Et.setjml2(input.nextInt());
            System.out.println("===============================");
            System.out.println("Total pesanan adalah " +Et.getjml2()+" Gelas, seharga Rp."+Et.getT2());
            System.out.println("Ditambahkan ke dalam tagihan");
            break;
            
            case 3 :
            KS.setNama("Kopi Susu");
            KS.Infodaftarmenu();
            System.out.println("Harga Kopi Susu Rp.4,000");
            System.out.print("Jumlah yang akan dipesan ? ");
            KS.setjml3(input.nextInt());
            System.out.println("===============================");
            System.out.println("Total pesanan adalah " +KS.getjml3()+" Gelas, seharga Rp."+KS.getT3());
            System.out.println("Ditambahkan ke dalam tagihan");
            break;
            
            case 4 :
            AM.setNama("ABC Mocca");
            AM.Infodaftarmenu();
            System.out.println("Harga ABC Mocca Rp.3,500");
            System.out.print("Jumlah yang akan dipesan ? ");
            AM.setjml4(input.nextInt());
            System.out.println("===============================");
            System.out.println("Total pesanan adalah " +AM.getjml4()+" Gelas seharga Rp."+AM.getT4());
            System.out.println("Ditambahkan ke dalam tagihan");
            break;

            case 5 :
            DB.setNama("Dring Beng-beng");
            DB.Infodaftarmenu();
            System.out.println("Harga Dring Beng-beng Rp.4,000");
            System.out.print("Jumlah yang akan dipesan ? ");
            DB.setjml5(input.nextInt());
            System.out.println("===============================");
            System.out.println("Total pesanan adalah " +DB.getjml5()+" Gelas, seharga Rp."+DB.getT5());
            System.out.println("Ditambahkan ke dalam tagihan");
            break;
            
            case 6 :
            CHLTS.setNama("Choholatos");
            CHLTS.Infodaftarmenu();
            System.out.println("Harga Choholatos Rp.4,000");
            System.out.print("Jumlah yang akan dipesan ? ");
            CHLTS.setjml6(input.nextInt());
            System.out.println("===============================");
            System.out.println("Total pesanan adalah " +CHLTS.getjml6()+" Gelas, seharga Rp."+CHLTS.getT6());
            System.out.println("Ditambahkan ke dalam tagihan");
            break;
            
            case 7:
            System.out.println();
            System.out.println("Anda Membatalkan Pesanan !");
            System.out.println();
            System.out.println();
            System.exit(0);
            
        }
        System.out.println();
        System.out.println("Ingin meneruskan pesanan ? / mengakhiri pesanan ?");
                System.out.print("ya meneruskan(enter : y) atau tidak meneruskan(enter : t) ? : ");
                ulang = input.next().charAt(0);
                System.out.println();
                System.out.print("\u001B[2J");
         }
            while (ulang !='t');
            minum=(Ntrs.getT1()+Et.getT2()+KS.getT3()+AM.getT4()+DB.getT5()+CHLTS.getT6());
            System.out.println("Keseluruhan Daftar Minuman Yang Telah Di Pesan");
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println("1. Nutrisari Jeruk Seharga Rp.3.000 sebanyak "+Ntrs.getjml1()+" Gelas, dengan total harga Rp."+Ntrs.getT1());
            System.out.println();
            System.out.println("2. Es Teh seharga Rp.3000 sebanyak "+Et.getjml2()+" Gelas, dengan total harga Rp."+Et.getT2());
            System.out.println();
            System.out.println("3. Kopi Susu seharga Rp.4000 sebanyak "+KS.getjml3()+" Gelas, dengan total harga Rp."+KS.getT3());
            System.out.println();
            System.out.println("4. ABC Mocca seharga Rp.3500 sebanyak "+AM.getjml4()+" Gelas, dengan total harga Rp."+AM.getT4());
            System.out.println();
            System.out.println("5. Dring Beng-beng harga Rp.4000 sebanyak "+DB.getjml5()+" Gelas, dengan total harga Rp."+DB.getT5());
            System.out.println();
            System.out.println("6. Chocolatos seharga Rp.4000 sebanyak "+CHLTS.getjml6()+" Gelas, dengan total harga Rp."+CHLTS.getT6());
            System.out.println();
            System.out.println();
            System.out.println("Total Seluruh Tagihan Yang Harus Di Bayar Adalah Rp."+minum);
            System.out.println();
            System.out.println("Terimakasih Telah Datang Dan Memesan Minuman ^^");
            System.out.println();
            System.out.println();
            input.close();
                    
    }
}
