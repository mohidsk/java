package learningjava;

public class Decimal_format {
    public static void main(String[] args) {
        double i = 2.6783;
        String j = String.format("%.1f",i);
        System.out.println(j);
    }
}
