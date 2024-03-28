import java.util.Scanner;
import java.util.SortedMap;

public class Main {

    public static  void main (String[] args) {


        // Scanner objesi ile -- >  Kullanıcıdan Input Alma


        Scanner scanner = new Scanner(System.in);     // Scanner sınıfında scanner objesi olusturduk.

        System.out.println("Please Enter Your Age :)");

        int age = scanner.nextInt();  // kullanıcı int deger girince bu degeri al age e esitleme fonksiyonu
        System.out.println("Your Age: " + age);


        System.out.println("Please Enter Number :)");
        double number = scanner.nextDouble();
      System.out.println("Number:" + number);


        System.out.println("Please Your Name");
        String yourName = scanner.next();  // kullanıcı yazı girdiginde ınput alma
        System.out.println("Your Name: " + yourName);


        // Kullanıcan int istenip string girdi diyelim bunu önlemek icin ne yapılabililr ? if kullanabililriz.

        if ( scanner.hasNextInt()) {
            int number2 = scanner.nextInt();
            System.out.println("Number: " + number2);
        } else {

            System.out.println("Please Enter Number!");
        }


        // Scanner Kullanırken Karsılastıgımız Sorunlar


        int age2 = scanner.nextInt();
        //scanner.nextLine(); // Dummy eger. ne age2 yi girince name2 yi sormadan sonlandırırsa bunu kullan.
        String name2 = scanner.next();
        System.out.println("Your Age2: " + age2);
        System.out.println("Your Name2:" + name2);


        int age3 = scanner.nextInt();
        int age4 = scanner.nextInt();
        int age5 = scanner.nextInt();
        System.out.println("age3:" + age3 + "age4:" + age4 + "age5:" + age5);







    }
}
