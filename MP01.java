import java.util.Scanner;

public class MP01 {
    public static void main (String[] args) {
       Scanner sc = new Scanner(System.in);

       System.out.print("전압 입력: ");
       int V = sc.nextInt();

       System.out.print("저항 입력: ");
       int R = sc.nextInt();

       System.out.println("전력 P: " + V*V/R);
       int W = V*V/R;

       System.out.println("dBm: " + 10 * Math.log10(W) + 30);




    }
}
