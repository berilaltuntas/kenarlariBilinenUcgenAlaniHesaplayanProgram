import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double kenar1,kenar2,kenar3,u,alan;

        Scanner input=new Scanner(System.in);

        System.out.print("1. Kenar Uzunluğunu Giriniz: " );
        kenar1=input.nextDouble();

        System.out.print("2. Kenar Uzunluğunu Giriniz: " );
        kenar2= input.nextDouble();

        System.out.print("3. Kenar Uzunluğunu Giriniz: " );
        kenar3= input.nextDouble();
    // Kullanıcıdan aldığımız verilerle alanı hesaplıyoruz.
        u= (kenar1 + kenar2 + kenar3)/2;
        alan= Math.sqrt(u*(u-kenar1)*(u-kenar2)*(u-kenar3));

        System.out.println("Üçgenin Alanı:" +alan);
    }
}