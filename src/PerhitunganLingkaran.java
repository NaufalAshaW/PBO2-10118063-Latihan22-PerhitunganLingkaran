/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author 
 * NAMA   : Naufal Asha
 * KELAS  : IF-2
 * NIM    : 10118063
 */
public class PerhitunganLingkaran {

    /**
     * @param args
     */
      public static void main(String[] args){
          Scanner scanner = new Scanner(System.in);
          
          System.out.println("======== Perhitungan Lingkaran ========");
          
          boolean success = false;
        
        while(!success) {
            System.out.print("Masukan nilai diameter lingkaran : ");

            if(!scanner.hasNextDouble()) {
                System.out.println("Nilai Diameter Tidak Sesuai");
                scanner.next();
                continue;
            }
            
            success = true;
        }
            double diameter = scanner.nextDouble();
            double jariJari = diameter/2;
            double luas = 3.14*(jariJari*jariJari);
            double keliling = 3.14*diameter;
            
            System.out.println("========== Hasil Perhitungan Lingkaran ==========");
            System.out.println("Jari-jari Lingkaran = " + jariJari + " cm");
            System.out.println("Luas Lingkaran = " + luas + " cm");
            System.out.println("Keliling Lingkaran = " + keliling + " cm");
  }
}
