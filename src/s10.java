import java.util.Scanner;

public class s10 {

    public static void main(String[] args) {

        final String ad = "Ali";
        final String soyad= "Güllü";

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen sayı giriniz.");
        int sayı = scanner.nextInt();
        if (sayı % 2 == 1) {
            if (ad.length() >= sayı) {
                for (int i = 0 ; i < sayı ; i++) {
                    System.out.print(ad.charAt(i));
                }
            }
            else {
                System.out.println("Lütfen girdiğiniz sayı adınızın index değerinden fazla olmasın.");
            }
        }
        if (sayı % 2 == 0) {
            if (soyad.length() >= sayı) {
                int i = 0;
                while (i < sayı) {
                    System.out.print(soyad.charAt(i));
                    i++;
                }
            }
            else {
                System.out.print("Lütfen girdiğiniz sayı soyadınızın index değerinden fazla olmasın.");
            }
        }
    }
}