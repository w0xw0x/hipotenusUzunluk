import java.util.Scanner;
public class hipotenusBulma {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a,b;
        System.out.println("Dik Kenarlardan Birini Giriniz : ");
        a = input.nextInt();

        System.out.println("Dik Kenarlardan Öbürünü de Giriniz : ");
        b = input.nextInt();

        double hipo;
        hipo = Math.sqrt(a*a + b*b);

        System.out.println("Hipotenüs Uzunluğunuz : " +hipo);
        System.out.println("Hipotenüs Formülü ==> a^2 + b^2 = c^2'dir.");
    }
}
