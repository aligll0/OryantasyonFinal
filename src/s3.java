import java.util.Scanner;

public class s3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String password = "java";

        final int hak = 5;

        int counter = 1;

        System.out.println("Lütfen şifreyi giriniz.");

        while(counter <= hak) {
            String giriş = scanner.nextLine();

            if (giriş.equals(password)) {
                System.out.println("Şifre doğru giriş başarılı");
                break;
            }
            else {
                System.out.println("Giriş başarısız lütfen şifreyi tekrar dene.");
            }
            counter++;
        }
    }
}
