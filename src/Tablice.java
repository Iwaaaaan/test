import java.util.Arrays;

public class Tablice {
    public static void main(String[] args) {
        String[] myList;
        myList = new String[10];
        for (int i = 0; i < myList.length; i++) {
            myList[i] = "A";
            System.out.println(i + "-" + myList[i]);
        }

        System.out.println();
        int[] liczby;
        liczby = new int[10];
        for (int i = 0; i < liczby.length; i++) {
            liczby[i] = i + 1;
            System.out.println(i + "-" + liczby[i]);
        }

        System.out.println();
        liczby = new int[10];
        for (int i = 0; i < liczby.length; i++) {
            liczby[i] = i * 2;
            System.out.println(i + "-" + liczby[i]);

        }
        System.out.println();
        liczby = new int[10];
        for (int i = 0; i < liczby.length; i++) {
            liczby[i] = i * 2 + 1;
            System.out.println(i + "-" + liczby[i]);
        }

        System.out.println();
        String[] imiona = new String[]{"Marcin", "Mariusz", "Marta", "Karolina", "Wojtek", "Alicja", "Mikołaj", "Stanisław", "Szymon", "Afrodyta"};
        for (int i = 0; i < imiona.length; i++) {
            System.out.println(i + "-" + imiona[i]);
        }
        System.out.println();
        String imiona2 = "Marcin, Mariusz, Marta, Karolina, Wojtek, Alicja, Mikołaj, Stanisław, Szymon, Afrodyta";
        String[] sameImiona = imiona2.split(", ");
        for (int i = 0; i < sameImiona.length; i++) {
            System.out.println(i + "-" + sameImiona[i]);
        }
        System.out.println();
        String imiona3 = "Marcin, Mariusz, Marta, Karolina, Wojtek, Alicja, Mikołaj, Stanisław, Szymon, Afrodyta";
        String[] sameImiona1 = imiona3.split(", ");

        for (int i = 0; i < sameImiona1.length; i++) {
            if (sameImiona1[i].startsWith("M")){
                sameImiona1[i] = "Legia";
            }
            System.out.println(i + "-" + sameImiona1[i]);
        }
        System.out.println(Arrays.toString(sameImiona1));
    }
}