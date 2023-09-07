import java.util.Scanner;

public class LiczbyParzystaV1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner( System.in );
        System.out.print("Ile liczb parzystych wyświetlić?");
        int n = scanner.nextInt();
        int liczba = 0;

        for (int i = 0; i < n; i++) {
            System.out.println( liczba );
            liczba = liczba + 2;
        }

    }


}
