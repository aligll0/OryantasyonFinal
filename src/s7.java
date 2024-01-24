import java.util.Scanner;

public class s7 {

    public static void main(String[] args) {
        int result = 1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen faktöriyelini almak istediğiniz sayıyı giriniz.");
        int sayı = scanner.nextInt();
        for(int i = 1 ; i <= sayı ; i++) {
            result *= i;
        }
        System.out.println(sayı + "! -> " + result);
    }
}