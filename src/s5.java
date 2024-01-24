import java.util.Scanner;

public class s5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen sayıyı giriniz.");
        String sayı = scanner.nextLine();
        String[] dizi = sayı.split("");

        int çiftSayılarToplamı = 0; int tekSayılarToplamı = 0;
        for (String s : dizi) {
            if (Integer.valueOf(s) % 2 == 0) {
                çiftSayılarToplamı += Integer.valueOf(s);
            }
            else {
                tekSayılarToplamı += Integer.valueOf(s);
            }
        }

        System.out.println("Çift sayılar toplamı -> " + çiftSayılarToplamı);
        System.out.println("Tek sayılar toplamı -> " + tekSayılarToplamı);

    }
}
