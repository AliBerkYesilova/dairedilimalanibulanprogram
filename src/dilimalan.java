import java.util.Scanner;
public class dilimalan {
    public static void main(String[] args) {
        double r, alan, cevre, pi=3.14;
        Scanner input = new Scanner(System.in);

        System.out.print("Dairenin yarıçapını giriniz : ");
        r = input.nextDouble();

        alan = pi*r*r;
        System.out.println("Dairenin alanı : " + alan + "");

        cevre = 2*pi*r;
        System.out.println("Dairenin çevresi : " + cevre + "cm");

        double merkezAcı, daireDilimAlan;
        System.out.print("Dairenin merkez açısını giriniz : ");
        merkezAcı = input.nextDouble();

        daireDilimAlan=(pi*(r*r)*merkezAcı)/360;
        System.out.println("Daire diliminin alanı : " + daireDilimAlan + "");



    }

}
