import java.util.Scanner;

public class s4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputString =  scanner.nextLine();

        String[] parts = inputString.split("\\.");


        // ödev.doc


        for (int i = 0 ; i < parts.length-1 ; i++) {

            System.out.println("Dosya adı -> " + parts[i] + " Dosya uzantısı -> " + parts[parts.length-1]);
        }

    }
}
