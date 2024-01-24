import java.util.Scanner;

public class s8 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int toplam = 0;
        for (int i = 1 ; i <= 10 ; i++) {
            System.out.println("Lütfen sayı-" + i + " giriniz.");
            toplam =  toplam + scanner.nextInt();
        }
        System.out.println("Sayıların toplamı -> " + toplam);
    }
}