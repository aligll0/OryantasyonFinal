public class s9 {

    public static void main(String[] args) {
        int sayıToplam = 0;
        for (int i = 1 ; i <= 100 ; i++) {
            if (isIntegerCanSplitTo(i, 2) && (isIntegerCanSplitTo(i, 5)) && !isIntegerCanSplitTo(i, 7)) {
                System.out.println(i);
                sayıToplam += i;
            }
        }
        System.out.println("----------------------------------------");
        System.out.println("Sayıların toplamı -> " + sayıToplam);
        System.out.println("----------------------------------------");
    }
    public static boolean isIntegerCanSplitTo(int sayı, int splitInteger) {
        if (sayı % splitInteger == 0){
            return true;
        }
        return false;
    }
}