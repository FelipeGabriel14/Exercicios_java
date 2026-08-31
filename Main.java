import java.util.Locale;
public class Main {
    public static void main(String[] args) {
        var product1 = "Computer";
        var product2 = "Office desk";

        var age = 30;
        var code = 5290;
        var gender = 'F';

        var price1 = 2100.0;
        var price2 = 650.50;
        var measure = 53.234567;

        System.out.println("Products:");
        System.out.printf("%s, which price is $ %.1f %n", product1, price1);
        System.out.printf("%s, which price is $ %.2f %n %n", product2, price2);
        System.out.printf("Record: %d years old, code %d and gender: %c %n %n", age, code, gender);
        System.out.printf("Meause with eight decimal places: %.6f %n", measure);
        System.out.printf("Rouded (three decimal places): %.3f %n", measure);
        Locale.setDefault(Locale.US);
        System.out.printf("US decimal point: %.3f", measure);
    }
}