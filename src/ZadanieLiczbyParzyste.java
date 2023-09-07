import java.util.Scanner;

public class ZadanieLiczbyParzyste {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ile liczb parzystych wyświetlić?");
        int n = scanner.nextInt();


        for (int i = 0; i <= n*2-1; i++) {
            if (i % 2 == 0) {
                System.out.println(i);

            }

        }
    }

}





