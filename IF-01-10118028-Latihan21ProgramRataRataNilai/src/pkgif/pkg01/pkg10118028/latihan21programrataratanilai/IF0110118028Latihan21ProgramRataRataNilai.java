/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgif.pkg01.pkg10118028.latihan21programrataratanilai;
    import java.util.Scanner;
/**
 *
 * @author User
 * NAMA      : Surya Fakhriy Hasbi
   KELAS     : IF-01 2018
   NIM       : 10118028
   DESKRIPSI : Program Rata Rata Nilai
 */
public class IF0110118028Latihan21ProgramRataRataNilai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int jumlahMhs;
        int[]  nilaiMhs = new int[10];
        double rataNilai = 0 ;
        
        //input
        System.out.print("Masukkan banyaknya mahasiswa : ");
        Scanner tempMhs = new Scanner(System.in);
        jumlahMhs = tempMhs.nextInt();
        
        //perhitungan dan output
        for(int i= 1 ; i<=jumlahMhs ; i++){
            System.out.print("Masukkan nilai mahasiswa ke- " + i + " : ");
            Scanner tempNilai = new Scanner(System.in);
            nilaiMhs[i] = tempNilai.nextInt();
            rataNilai += nilaiMhs[i];
            
        }
        System.out.println("Rata-rata Nilai dari Mahasiswa adalah : " + (rataNilai / jumlahMhs));
        System.out.println("(Develovep by Surya Fakhriy Hasbi)");
    }
    
}
