import java.util.Random;
import java.util.Scanner;

public class s2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Lütfen kaç adet öğrenci seçileceğini seçiniz.");
        int gönderilecekÖğrenciSayısı = scanner.nextInt();

        String[] dizi = new String[gönderilecekÖğrenciSayısı];

        for (int i = 1 ; i <= gönderilecekÖğrenciSayısı ; i++) {
            int rastgeleNumara = new Random().nextInt(2023399 - 2023100 + 1) + 2023100;
            dizi[i-1] = i + ". öğrenci: " + rastgeleNumara;
        }

        for (String s : dizi) {
            System.out.println(s);
        }

    }
}
