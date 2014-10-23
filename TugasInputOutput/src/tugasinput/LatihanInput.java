package tugasinput;

import java.util.Scanner;

public class LatihanInput {

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan Nama : ");
        String nama = input.nextLine();
        
        System.out.print("Masukkan NPM : ");
        int npm = input.nextInt();
        input.nextLine();
        
        System.out.print("Masukkan Alamat : ");
        String alamat = input.nextLine();
        
        System.out.print("Masukkan Nilai Tugas Besar : ");
        int tugasbesar = input.nextInt();
        
        System.out.print("Masukkan Nilai Tugas Kecil : ");
        int tugaskecil = input.nextInt();
        
        System.out.print("Masukkan Nilai Kuis 1 : ");
        int kuis1 = input.nextInt();
        
        System.out.print("Masukkan Nilai Kuis 2 : ");
        int kuis2 = input.nextInt();
        
        System.out.print("Masukkan Nilai UTS : ");
        int nilaiuts = input.nextInt();
        
        System.out.print("Masukkan Nilai UAS Praktek : ");
        int uaspraktek = input.nextInt();
        
        System.out.print("Masukkan Nilai UAS Teori : ");
        int uasteori = input.nextInt();
        
        float tugas1 = (float) (tugasbesar * 0.7);
        float tugas2 = (float) (tugaskecil * 0.3);
        float tugas = tugas1 + tugas2;
        
        float kuis = kuis1 + kuis2 / 2;
        
        float uas1 = (float) (uaspraktek * 0.6);
        float uas2 = (float) (uasteori * 0.4);
        float uas = uas1 + uas2;
        
        float nilaikuis = (float) (kuis * 0.15);
        float nilaitugas = (float) (tugas * 0.3);
        float uts = (float) (nilaiuts * 0.25);
        float nilaiuas = (float) (uas * 0.3);
        float nilaiakhir = nilaikuis + nilaitugas + uts + nilaiuas;
        
        System.out.println("Nama Anda :"+nama);
        System.out.println("NPM Anda : "+npm);
        System.out.println("Nilai Kuis Anda : "+kuis);
        System.out.println("Nilai Tugas Anda : "+tugas);
        System.out.println("Nilai UTS Anda : "+nilaiuts);
        System.out.println("Nilai UAS Anda : "+uas);
        System.out.println("Nilai Akhir Anda :"+nilaiakhir);
    }
    
}
