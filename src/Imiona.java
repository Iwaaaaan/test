public class Imiona {
    private static boolean cointains;
    private static boolean startsWith;
    private static boolean length;

    public static void main(String[] args) {


        String[] imiona = {"Andrzej", "Kamil", "Zygmunt", "Marcin", "Marta", "Karolina", "Wojtek", "Alicja", "Mariusz", "Kundybał", "Stanisław", "Ala"};

        System.out.println("Wypisz imiona zaczynajęce się na literę M:");
        for (String imie : imiona) {
            if (imie.charAt(0) == 'M') {
                System.out.println(imie);
            }
        }


        System.out.println("Wypisz imiona z literą A lub a:");
        //char litera = 'a';

        for (String imie : imiona) {
            if (imie.contains("a") || imie.contains("A")) {
                System.out.println(imie);
            }
        }
        System.out.println("Wypisz imiona bez litery A lub a:");
        for (String imie : imiona) {
            if (!imie.contains("a") && !imie.contains("A")) {
                System.out.println(imie);


            }
        }
        System.out.println("Wypisz imiona zaczynajęce się od znaków \"Mar\" :");
        for (String imie : imiona) {
            if (imie.startsWith("Mar")) {
                System.out.println(imie);
            }
        }
        System.out.println("Wypisz imiona kończące się na  \"a\" :");
        for (String imie : imiona) {
            if (imie.endsWith("a")) {
                System.out.println(imie);
            }
        }
        System.out.println("Wypisz imiona które mają 5 liter:");
        for (String imie : imiona) {
            if (imie.length() == 5) {
                System.out.println(imie);
            }
        }
        System.out.println("Wypisz imiona które mają więcej niż 8 znaków:");
        for (String imie : imiona) {
            if (imie.length() > 8) {
                System.out.println(imie);
            }
        }
        System.out.println("Wypisz imiona które mają mniej niż 4 znaki:");
        for (String imie : imiona) {
            if (imie.length() < 4) {
                System.out.println(imie);
            }
        }
        System.out.println("Wypisz imiona o nieparzystym indeksie.");

        for (int i = 1; i <= imiona.length; i = i + 2) {
            System.out.println(imiona[i]);

        }
        System.out.println("Wypisz imiona o nieparzystym indeksie.");

        for (int i = 0; i < imiona.length; i++) {
            if (i % 2 == 1) {

                System.out.println(imiona[i]);
            }
            System.out.println("Wypisz imiona z literą A lub a oraz imię musi mieć 5 znaków:");


            for (String imie : imiona) {
                if (imie.contains("a") || imie.contains("A")) {
                    if (imie.length() == 5) {

                        System.out.println(imie);
                    }
                }

                    }
            }
        }
    }
