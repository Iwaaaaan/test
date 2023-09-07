import java.util.Scanner;

public class Pi {

    public static void main(String[] args) {
        //psvm

        System.out.println(Math.PI);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj średnicę koła: ");
        double n = scanner.nextDouble();
        // PI R do kwadratu
        double promien = n/2;
        double PoleKola = Math.PI * promien * promien;
        System.out.println("Pole koła wynosi " + PoleKola);


    }
}
