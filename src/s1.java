import java.util.Scanner;

public class s1 {

    public static void main(String[] args) {
        String[][] dizi = new String[2][2];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0 ; i < dizi.length ; i++) {
            for (int j = 0 ; j < dizi[i].length ; j++) {
                dizi[i][j] = scanner.nextLine();
            }
        }
        for (int i = 0 ; i < dizi.length ; i++) {
            for (int j = 0 ; j < dizi[i].length ; j++) {

                String value = dizi[i][j];

                if (new s1().isStringPalindrome(value)) {

                    System.out.println(value);

                }
            }
        }
    }

    public boolean isStringPalindrome(String value) {
        String kelime = "";
        for (int i = value.length() - 1 ; i >= 0 ; i--) {
            kelime += value.charAt(i);
        }
        if (kelime.equals(value)) {
            return true;
        }
        return false;
    }
}
