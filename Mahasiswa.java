import java.util.ArrayList;

public class Mahasiswa {

  public static void main(String[] agrs) {
    ArrayList<Daftar> nilaiMahasiswa = new ArrayList<Daftar>();

    String namaMahasiswa = "hamdan";
    int semester = 1;

    for (Daftar list : nilaiMahasiswa) {
      if (namaMahasiswa == "hamdan" && semester == 1) {
        System.out.println(
          list.matakuliah + "\t\t" + list.nilaiSKS + "\t\t"
        );
      }
    }
  }
}
