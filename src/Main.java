import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Hai32();
        Kvadraten(7);
        Multi(1.0, 1.0);
        Triangel(2.0, 5.0);
        Crikel(4.0);
        GetNumberInput();
        GetChoice();
    }

    public static void Hai32() {
        for (int i = 0; i < 32; i++) {
            System.out.println("helo vörld");
        }
    }

    public static int Kvadraten(int ett) {
        int summa = ett * ett;
        return summa;
    }

    public static double Multi(Double ett, Double två) {
        Double summa = ett * två;
        return summa;
    }

    public static double Triangel(Double b, Double h) {
        return (b * h) / 2;
    }

    public static double Crikel(Double radie) {
        return radie * radie * 3.14;
    }

    public static int GetNumberInput() {
        int number = 0;
        Scanner getTal = new Scanner(System.in);
        while (true) {
            try {
                number = getTal.nextInt();
                getTal.nextLine();
                break;

            } catch (Exception e) {
                System.out.println("skibidiautoban");
                getTal.nextLine();

            }
        }

        return number;
    }

    public static void GetChoice() {
        String[] val = {"hej", "hai", "hola"};
        int svar = 0;
        while (true) {
            for (int i = 0; i < val.length; i++) {
                System.out.println((i + 1) + "." + val[i]);

            }
            System.out.println("Välj ett tal mellan 1-3");
            svar = GetNumberInput();


            if (svar >= 1 && svar <= 3) {
                break;

            } else {


            }
        }
        System.out.println(val[svar - 1]);
    }


}