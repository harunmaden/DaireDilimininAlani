import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int a, r;
        double diliminalani;
        double pi = 3.14;
        Scanner inp = new Scanner(System.in);
        System.out.print("Yarı Çapı Giriniz : ");
        r = inp.nextInt();
        System.out.print("Açıyı Giriniz : ");
        a = inp.nextInt();

        diliminalani = (pi * (r * r) * a) / 360;
        System.out.println(diliminalani);
    }
}