import java.util.Scanner;
public class Gaji {
  
  public static bonus main (String[] args) {
    int Gaji;
    int JamLembur;
    int UangLembur = 173;
    
    Scanner GajidanLembur = new Scanner(System.in);
    
    System.out.print("Gaji :   ");
    Gaji = GajidanLembur.nextInt();
    
    System.out.print("jam lembur:  ");
    JamLembur = GajidanLembur.nextInt();
    
    int hitungGaji = Gaji / UangLembur ;
    hitungGaji = (UangLembur + 100000) / 100000 * 100000;
    hitungGaji *= 4;

    int hitungGajiLebih = hitungGaji ;
    hitungGajiLebih = (UangLembur + 100000) / 100000 * 100000;
    if (JamLembur > 4) {
    hitungGajiLebih *= 2;
    }

  System.out.println(
     "total Gaji yang diterima :" + (hitungGaji *= hitungGajiLebih+Gaji)
);
}
}


