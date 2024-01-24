import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class s6 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lütfen dizinin boyutunu seçin");
        int boyut = scanner.nextInt();

        Integer[] dizi = new Integer[boyut];

        for (int i = 1 ; i <= boyut ; i++) {
            System.out.println("Lütfen dizinin sayı-" + i + " giriniz.");
            dizi[i-1] = scanner.nextInt();
        }

        Arrays.sort(dizi, Collections.reverseOrder());

        for (int a : dizi) {
            System.out.print(a + " ");
        }
    }
}
