import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;
import java.text.SimpleDateFormat;
public class ZadanieLiczbowe {
    public static void main(String[] args) throws IOException {
        boolean czyCalkowita;
        boolean czyCalkowita2;
        String mnożenie = null;
        String dodawanie = null;
        Random r = new Random();
        DateTimeFormatter data = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter data2 = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        LocalDateTime now2 = LocalDateTime.now();
        Scanner scan = new Scanner(System.in);
        double second = 0.5;
        String dzialanie;
        System.out.println("Podaj pierwszą liczbę całkowitą");
        double first = scan.nextDouble();
        if (first == (int) first) {
            czyCalkowita = true;
            System.out.println("Podaj drugą liczbę całkowitą");
            second = scan.nextDouble();
        } else {
            czyCalkowita = false;
            while (first != (int) first) {
                System.out.println("To nie jest liczba całkowita, spróbuj ponownie");
                first = scan.nextDouble();
            }
            System.out.println("Podaj drugą liczbę całkowitą");
            second = scan.nextDouble();
            if (second == (int) second) {
                czyCalkowita2 = true;
            } else {
                czyCalkowita2 = false;
                while (second != (int) second) {
                    System.out.println("To nie jest liczba całkowita, spróbuj ponownie");
                    second = scan.nextDouble();
                }
            }
        }
        System.out.println("Jaką operację na liczbach chcesz wykonać?");
        dzialanie = scan.next();
        if (dzialanie.equals("mnożenie")) {
            int a = (int) (first * second);
            System.out.println("Wynik mnożenia wybranych liczb to: " + a);
        }
        if (dzialanie.equals("dodawanie")) {
            int b = (int) (first + second);
            System.out.println("Wynik dodawania wybranych liczb to:" + b);
        }
        if (dzialanie.equals("dzielenie")){
            double c = (double) (first / second);
            System.out.println("Wynik dzielenia pierwszej liczby przez drugą to:" + c);
        }
        if (dzialanie.equals("odejmowanie")){
            int d = (int) (first - second);
            System.out.println("Wynik odejmowania pierwszej liczby od drugiej to:" + d);
        }
        if (dzialanie.equals("End")){
            System.out.println(data.format(now));
        }
        if (dzialanie.equals("Random")){
            int e = r.nextInt(11);
            int f = r.nextInt(11);
            int ef = e + f;
            System.out.println("Wylosowane liczby:" + e + " oraz " + f + " ich suma to: " + ef);
        }
        if (dzialanie.equals("File")) {
            try {
                System.out.println("Podaj nazwę pliku (bez spacji)");
                String nazwaPliku = scan.next();
                File txt = new File(nazwaPliku + ".txt");
                FileWriter dane = new FileWriter(txt);
                dane.write(String.valueOf(data2.format(now2)));
                dane.close();
                System.out.println("Plik o nazwie " + nazwaPliku + "został utworzony.");
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            if (dzialanie.equals("Show")){

            }
        }
    }

    }


