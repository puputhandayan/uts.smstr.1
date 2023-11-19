public class LoopJava {

  public static void main(String[] args) {
    int N = 4;

    for (int i = 1; i <= N; i++) {
      for (int j = 1; j <= N - i; j++) {
        System.out.print("S");
      }

      for (int k = 1; k <= i; k++) {
        System.out.print("O");
      }
      System.out.println();
    }
  }
}
